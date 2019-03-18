package controllers;

import controllers.*;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import play.Logger;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

// Import models and views
import models.users.*;
import models.projects.*;

import views.html.projectAdmin.*;


/* - Docs -
http://superuser.com/questions/163818/how-to-install-rmagick-on-ubuntu-10-04
http://im4java.sourceforge.net/
*/

// Authenticate user
@Security.Authenticated(Secured.class)
// Authorise user (check if admin)
@With(AuthAdmin.class)

public class AdminProjectCtrl extends Controller {

    /** Dependency Injection **/

    /**
     * http://stackoverflow.com/questions/15600186/play-framework-dependency-injection
     **/
    private FormFactory formFactory;

    /**
     * http://stackoverflow.com/a/37024198
     **/
    private Environment env;

    /**
     * http://stackoverflow.com/a/10159220/6322856
     **/
    @Inject
    public AdminProjectCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }


    // Get a user - if logged in email will be set in the session
    private User getCurrentUser() {
        User u = User.getLoggedIn(session().get("email"));
        return u;
    }

    public Result index() {
        return redirect(controllers.routes.AdminProjectCtrl.listProjects(0));
    }

    // Get a list of projects
    // If cat parameter is 0 then return all projects
    // Otherwise return projects for a category (by id)
    @Transactional
    public Result listProjects(Long cat) {
        // Get list of categories in ascending order
        List<Category> categories = Category.find.query().where().orderBy("name asc").findList();
        // Instantiate projects, an Array list of projects			
        List<Project> projects = new ArrayList<Project>();

        if (cat == 0) {
            // Get the list of ALL projects with filter
            projects = Project.findAll("");
        } else {
            // Get projects for the selected category and filter (search field)
            projects = Project.findFilter(cat, "");
        }
        // Render the list projects view, passing parameters
        // categories and projects lists
        // current user - if one is logged in
        return ok(listProjects.render(env, categories, projects, getCurrentUser()));
    }

    // Load the add project view
    // Display an empty form in the view
    @Transactional
    public Result addProject() {
       
        Form<Project> addProjectForm = formFactory.form(Project.class);
       
        return ok(addProject.render(addProjectForm, getCurrentUser()));
    }

    // Handle the form data when a new project is submitted
    @Transactional
    public Result addProjectSubmit() {



       Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();

        if (newProjectForm.hasErrors()) {
            return badRequest(addProject.render(newProjectForm, getCurrentUser()));
        }

        Project newProject = newProjectForm.get();

        newProject.save();

        for (Long cat : newProject.getCatSelect()) {
            newProject.getCategories().add(Category.find.byId(cat));
        }

        newProject.update();

        MultipartFormData<File> data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

       String saveImageMsg = saveFile(newProject.getId(), image); ///fixed! - ryan

        // Set a success message in temporary flash
        flash("success", "Project " + newProject.getName() + " has been created" + " " + saveImageMsg);

        // Redirect to the admin home
        return redirect(controllers.routes.AdminProjectCtrl.index());
    }

    // Update a project by ID
    // called when edit button is pressed
    @Transactional
    public Result updateProject(Long id) {
        // Retrieve the project by id
        // Create a form based on the Project class
        Project p = Project.find.byId(id);
        Form<Project> projectForm = formFactory.form(Project.class).fill(p);
        // Render the updateProject view
        // pass the id and form as parameters
        return ok(updateProject.render(id, projectForm, User.getLoggedIn(session().get("email"))));
    }


    @Transactional
    public Result updateProjectSubmit(Long id) {

        String saveImageMsg;

        Form<Project> updateProjectForm = formFactory.form(Project.class).bindFromRequest();

        if (updateProjectForm.hasErrors()) {
            return badRequest(updateProject.render(id, updateProjectForm, getCurrentUser()));
        }

        Project p = updateProjectForm.get();
        p.setId(id);

        List<Category> newCats = new ArrayList<Category>();
        for (Long cat : p.getCatSelect()) {
            newCats.add(Category.find.byId(cat));
        }
        p.setCategories(newCats);


        p.update();

        Http.MultipartFormData body = request().body().asMultipartFormData();
       Http.MultipartFormData.FilePart file = body.getFile("upload");

        return redirect(controllers.routes.AdminProjectCtrl.index());
    }



    // Delete Project
    @Transactional
    public Result deleteProject(Long id) {
        // Call delete method
        Project.find.ref(id).delete();
        // Add message to flash session 
        flash("success", "Project has been deleted");
        // Redirect home
        return redirect(routes.AdminProjectCtrl.index());
    }

    // Save an image file


    public String saveFile(Long id, FilePart<File> image) {
        if (image != null) {
            // Get mimetype from image
            String mimeType = image.getContentType();
            // Check if uploaded file is an image
            if (mimeType.startsWith("image/")) {
                // Create file from uploaded image
                File file = image.getFile();
                // create ImageMagick command instance
                ConvertCmd cmd = new ConvertCmd();
                // create the operation, add images and operators/options
                IMOperation op = new IMOperation();
                // Get the uploaded image file
                op.addImage(file.getAbsolutePath());
                // Resize using height and width constraints
                op.resize(300,200);
                // Save the  image
                op.addImage("public/images/EmployeeImages/" + id + ".jpg");
                // thumbnail
                IMOperation thumb = new IMOperation();
                // Get the uploaded image file
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                // Save the  image
                thumb.addImage("public/images/EmployeeImages/thumbnails/" + id + ".jpg");
                // execute the operation
                try{
                    cmd.run(op);
                    cmd.run(thumb);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "image file missing";
    }
}