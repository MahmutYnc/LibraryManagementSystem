package Admin;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class AdminLogin {
    JFrame loginFrame = new JFrame("Login Section");
    JPanel loginPanel = new JPanel();
    JButton loginButton = new JButton("Login");
    JButton turnBack = new JButton("");
    Dimension dimension = new Dimension(80, 30);

    JTextPane enterName = new JTextPane();
    JTextPane enterPassword = new JTextPane();

    public AdminLogin() {
        loginButton.setSize(dimension);
        dimension.width = 80;
        dimension.height = 30;
        turnBack.setSize(dimension);

        loginPanel.setLayout(null);
        loginPanel.add(turnBack);
        turnBack.setLocation(500, 20);
        try {
            Image img = ImageIO.read(getClass().getResource("left-arrow-key.png"));
            turnBack.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // to remote the spacing between the image and button's borders
        turnBack.setMargin(new Insets(0, 0, 0, 0));
        // to add a different background
        turnBack.setBackground(Color.decode("#7aacfa"));
        // to remove the border
        turnBack.setBorder(null);
        

        loginPanel.add(loginButton);
        loginButton.setLocation(250, 250);

        loginPanel.add(enterName);
        enterName.setLocation(100, 200);

        loginPanel.setBackground(Color.decode("#7aacfa"));

        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setLocation(400, 100);
        loginFrame.setResizable(false);
        loginFrame.setFocusable(true);
        loginFrame.setSize(600, 400);
        loginFrame.setVisible(true);
        loginFrame.add(loginPanel);

    }

}
