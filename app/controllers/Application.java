package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(views.html.index.render());
    }
    
    
    /**
     * Display the chat room.
     */
    public static Result chatRoom(String username) {
        if(username == null || username.trim().equals("")) {
            flash("error", "Please choose a valid username.");
            return redirect(routes.Application.index());
        }
        return ok(views.html.chatRoom.render(username));
    }
    
    public static Result registerForm() {
        return ok(views.html.register.render());
    }
  
}
