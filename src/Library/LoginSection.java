package Library;

import javax.swing.*;
import java.awt.*;

public class LoginSection {

    JFrame loginFrame = new JFrame("Login Section");
    JPanel loginPanel = new JPanel();
    JButton adminButton = new JButton("Admin");
    JButton librarianbutton = new JButton("Librarian");
    Dimension dimension = new Dimension(150,70);

    public LoginSection() {

        adminButton.setSize(dimension);
        librarianbutton.setSize(dimension);

        loginPanel.setLayout(null);
        loginPanel.add(librarianbutton);
        librarianbutton.setLocation(200,200);
        loginPanel.add(adminButton);
        adminButton.setLocation(200, 100);
        loginPanel.setBackground(Color.decode("#7aacfa"));

        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setLocation(400,100);
        loginFrame.setResizable(false);
        loginFrame.setFocusable(true);
        loginFrame.setSize(600,400);
        loginFrame.setVisible(true);
        loginFrame.add(loginPanel);

        onAction();
    }

    public void onAction(){
        adminButton.addActionListener(actionEvent -> {
            //open Admin frame
            System.out.println("Opening Admin Panel");
        });
        librarianbutton.addActionListener(actionEvent -> {
            //open Librarian frame
        });
    }



}
