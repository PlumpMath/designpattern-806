package pattern.mvc.controller;

import pattern.mvc.model.Model;
import pattern.mvc.view.LoginFormEvent;
import pattern.mvc.view.View;

/**
 * Created by gauravs on 16/2/16.
 */
public class Controller implements LoginListener {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }


    @Override
    public void loginPerformed(LoginFormEvent loginFormEvent) {
        System.out.print("Login event received: ");
        System.out.println(loginFormEvent.getUsername()+ " : "+loginFormEvent.getPassword());
    }
}
