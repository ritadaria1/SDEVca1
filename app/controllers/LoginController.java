package controllers;

import models.users.User;
import play.mvc.*;

import views.html.*;

import play.data.*;

import javax.inject.Inject;

import models.users.Login;

public class LoginController extends Controller {
    private FormFactory formFactory;

@Inject
public LoginController(FormFactory f){
    this.formFactory = f;
}


public Result login() {
    Form<Login> loginForm = formFactory.form(Login.class);
    return ok(login.render(loginForm, User.getUserById(session().get("email"))));
 }



public Result loginSubmit(){
    Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

    if (loginForm.hasErrors()){
        return badRequest(login.render(loginForm, User.getUserById(session().get("email"))));
    } else {
        session().clear();
       // Store the logged in email in the session
            session("email", loginForm.get().getEmail());
            
            // Check user type
            User u = User.getLoggedIn(loginForm.get().getEmail());
            // If admin - go to admin section
            if (u != null && "admin".equals(u.getRole())) {
                return redirect(controllers.routes.AdminProjectCtrl.index());
            }
            
            // Return to home page
            return redirect(controllers.routes.ProjectCtrl.index());
    }
}


public Result logout(){
    session().clear();
    flash("success", "You have been logged out");
    return redirect(routes.LoginController.login());
}





}

