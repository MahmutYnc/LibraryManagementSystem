package Admin;

import javax.swing.*;
import java.awt.*;

public class AdminLogin {
    JFrame loginFrame = new JFrame("Login Section");
    JPanel loginPanel = new JPanel();
    JButton loginButton = new JButton("Login");
    JButton turnBack = new JButton("Turn Back");
    Dimension dimension = new Dimension(80,30);

    public AdminLogin (){
        loginButton.setSize(dimension);
        turnBack.setSize(dimension);

        loginPanel.setLayout(null);
        loginPanel.add(turnBack);
        turnBack.setLocation(200,200);
        loginPanel.add(loginButton);
        loginButton.setLocation(200, 100);
        loginPanel.setBackground(Color.decode("#7aacfa"));

        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setLocation(400,100);
        loginFrame.setResizable(false);
        loginFrame.setFocusable(true);
        loginFrame.setSize(600,400);
        loginFrame.setVisible(true);
        loginFrame.add(loginPanel);

    }
}
