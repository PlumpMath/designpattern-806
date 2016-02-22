package pattern.mvc;

import pattern.mvc.controller.Controller;
import pattern.mvc.model.Model;
import pattern.mvc.view.View;

import javax.swing.*;

/**
 * Created by gauravs on 16/2/16.
 */
public class Application {

    public static void main(String args[])
    {
        SwingUtilities.invokeLater(() -> {runApp();});
    }

    public static void runApp()
    {
        Model model = new Model();
        View view  = new View();
        Controller controller = new Controller(model, view);
        view.setLoginListener(controller);
    }
}
