package Admin;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class AdminLogin {
    JFrame loginFrame = new JFrame("Login Section");
    JPanel loginPanel = new JPanel();
    JButton loginButton = new JButton("Login");
    JButton turnBack = new JButton("");
    Dimension dimension = new Dimension(80,30);

    public AdminLogin (){
        loginButton.setSize(dimension);
        dimension.width=80;
        dimension.height=40;
        turnBack.setSize(dimension);

        loginPanel.setLayout(null);
        loginPanel.add(turnBack);
        turnBack.setLocation(500,20);
        try {
            Image img = ImageIO.read(getClass().getResource("go-back-arrow.png"));
            turnBack.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        loginPanel.add(loginButton);
        loginButton.setLocation(250, 250);
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
