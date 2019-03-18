package controllers;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import javax.inject.Inject;
import views.html.*;
import models.users.*;
import java.util.*;
import org.mindrot.jbcrypt.BCrypt;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


    private FormFactory formFactory;


    @Inject
    public HomeController (FormFactory f){
        this.formFactory = f;
    }



    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    // public Result addEmployee(){
    //    return ok(addEmployee.render());
    // }


//    @Security.Authenticated(Secured.class)
    // @With(AuthAdmin.class)
//    @Transactional
    //  public Result addUser() {
    //       Form<User> employeeForm = formFactory.form(User.class);
    //     return ok(addUser.render(employeeForm, User.getUserById(session().get("email"))));
    //


    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addUser(){
        Form<User> userForm = formFactory.form(User.class);
        return ok(addUser.render(userForm,  User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addUserSubmit(){
        Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();

        if(newUserForm.hasErrors()){
            return badRequest(addUser.render(newUserForm, User.getUserById(session().get("email"))));
        }else{
            User newUser = newUserForm.get();


            newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));

            newUser.save();
            flash("You're successfully registered. Thanks.");
            return redirect(controllers.routes.HomeController.index());
        }}


    public Result registerUser(){
        Form<Customer> userForm = formFactory.form(Customer.class);
        return ok(registerUser.render(userForm,  User.getUserById(session().get("email"))));
    }


    public Result registerUserSubmit(){
        Form<Customer> customerForm = formFactory.form(Customer.class).bindFromRequest();

        if(customerForm.hasErrors()){
            return badRequest(registerUser.render(customerForm, User.getUserById(session().get("email"))));
        }else{
            Customer newCustomer = customerForm.get();
            newCustomer.setPassword(BCrypt.hashpw(newCustomer.getPassword(), BCrypt.gensalt()));
            newCustomer.save();
            flash("You have Successfully registered!");
            return redirect(controllers.routes.HomeController.index());
        }

    }

}



