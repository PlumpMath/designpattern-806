package pattern.mvc.controller;

import pattern.mvc.view.LoginFormEvent;

/**
 * Created by gauravs on 16/2/16.
 */
public interface LoginListener {
    public void loginPerformed(LoginFormEvent loginFormEvent);
}
