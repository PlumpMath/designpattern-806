package pattern.mvc.view;

import pattern.mvc.controller.LoginListener;
import pattern.mvc.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by gauravs on 16/2/16.
 */
public class View extends JFrame {
    private JButton okButton;
    private JTextField nameField;
    private JPasswordField passField;
    private LoginListener loginListener;

    public View() {
        nameField = new JTextField(10);
        passField = new JPasswordField(10);
        okButton = new JButton("OK");

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.LAST_LINE_END;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(100, 0, 0, 10);
        gc.fill = GridBagConstraints.NONE;

        add(new JLabel("Name: "), gc);

        gc.anchor = GridBagConstraints.LAST_LINE_START;
        gc.gridx = 2;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(100, 0, 0, 0);
        gc.fill = GridBagConstraints.NONE;
        add(nameField, gc);

        gc.anchor = GridBagConstraints.LINE_END;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(0, 0, 0, 10);
        gc.fill = GridBagConstraints.NONE;
        add(new JLabel("Password: "), gc);

        gc.anchor = GridBagConstraints.LINE_END;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(0, 0, 0, 10);
        gc.fill = GridBagConstraints.NONE;
        add(new JLabel("Password: "), gc);

        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 2;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.fill = GridBagConstraints.NONE;
        add(passField, gc);

        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.gridx = 2;
        gc.gridy = 3;
        gc.weightx = 1;
        gc.weighty = 100;
        gc.fill = GridBagConstraints.NONE;
        add(okButton, gc);


        ActionListener al = (ae) -> {
            String password = new String(passField.getPassword());
            String name = nameField.getText();
            fireLoginEvent(new LoginFormEvent(name, password));
        };

        okButton.addActionListener(al);

        setSize(600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void fireLoginEvent(LoginFormEvent loginFormEvent) {
        if (loginListener != null)
            this.loginListener.loginPerformed(loginFormEvent);
    }

    public void setLoginListener(LoginListener loginListener) {
        this.loginListener = loginListener;
    }


    //old code of view

    /**
     *
     *
     * private JButton helloButton;
     private JButton goodbyeButton;
     public View(Model model) {
     this.model = model;

     helloButton = new JButton("Hello!");
     goodbyeButton = new JButton("Good Bye!");
     setLayout(new GridLayout());
     GridBagConstraints gc = new GridBagConstraints();
     gc.anchor=GridBagConstraints.CENTER;
     gc.gridx=1;
     gc.gridy=1;
     gc.gridheight=0;
     gc.gridwidth=0;
     gc.weightx=1;
     gc.weighty =1;

     gc.fill=GridBagConstraints.NONE;
     add(helloButton, gc);

     gc.anchor=GridBagConstraints.CENTER;
     gc.gridx=1;
     gc.gridy=2;
     gc.gridheight=0;
     gc.gridwidth=0;
     gc.weightx=1;
     gc.weighty =1;

     add(goodbyeButton, gc);

     ActionListener al = (ae) -> {
     JButton source = (JButton)ae.getSource();
     if(source == helloButton)
     {
     System.out.println("Hello There!");
     }
     else
     System.out.println("Some other button");
     };

     helloButton.addActionListener(al);
     goodbyeButton.addActionListener(al);

     setSize(600, 500);
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     setVisible(true);
     }
     */
}
