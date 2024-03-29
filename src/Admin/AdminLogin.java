package Admin;

import Library.LoginSection;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminLogin {
    JFrame loginFrame = new JFrame("Login Section");
    JPanel loginPanel = new JPanel();
    JButton loginButton = new JButton("Login");
    JButton goBack = new JButton("");
    Dimension dimension = new Dimension(80, 30);

    JLabel title = new JLabel("Admin Login Screen");
    JLabel enterName = new JLabel("Name: ");
    JLabel enterPassword = new JLabel("Password: ");

    JTextField nameField = new JTextField("Name here!");
    JTextField passwordField = new JTextField("Password here!");

    String name, password;

    public AdminLogin() {
        loginButton.setSize(dimension);
        dimension.width = 80;
        dimension.height = 30;
        goBack.setSize(dimension);
        loginPanel.setBackground(Color.decode("#7aacfa"));
        loginPanel.setLayout(null);
        loginPanel.add(goBack);
        goBack.setLocation(500, 20);
        try {
            Image img = ImageIO.read(getClass().getResource("left-arrow-key.png"));
            goBack.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // to remote the spacing between the image and button's borders
        goBack.setMargin(new Insets(0, 0, 0, 0));
        // to add a different background
        goBack.setBackground(Color.decode("#7aacfa"));
        // to remove the border
        goBack.setBorder(null);



        loginPanel.add(loginButton);
        loginButton.setLocation(250, 250);


        loginPanel.add(enterName);
        enterName.setBounds(250,250,70,30);
        enterName.setLocation(150, 150);
        loginPanel.add(enterPassword);
        enterPassword.setBounds(250,250,70,30);
        enterPassword.setLocation(150, 180);

        loginPanel.add(nameField);
        nameField.setBounds(250,250,100,25);
        nameField.setLocation(250,150);
        nameField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                nameField.setText("");
            }
        });
        loginPanel.add(passwordField);
        passwordField.setBounds(250,250,100,25);
        passwordField.setLocation(250,180);
        //passwordField.setOpaque(false);
        passwordField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                passwordField.setText("");
            }
        });

        Font f = new Font("serif", Font.BOLD, 34);
        title.setFont(f);
        loginPanel.add(title);
        title.setBounds(250,250,500,50);
        title.setLocation(120,50);

        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setLocation(400, 100);
        loginFrame.setResizable(false);
        loginFrame.setFocusable(true);
        loginFrame.setSize(600, 400);
        loginFrame.setVisible(true);
        loginFrame.add(loginPanel);

        goBackAction();
        loginAction();
    }

    public void goBackAction(){
        goBack.addActionListener(actionEvent -> {
            //return to the login section
            LoginSection loginSection = new LoginSection();
            loginFrame.dispose();
            System.out.println("it should return to the last page");
        });
    }
    public void loginAction(){
        loginButton.addActionListener(actionEvent -> {
            //Check the users id, password and if it is matches login to the system
            name = nameField.getText();
            password = passwordField.getText();

            if (name.equalsIgnoreCase("admin") && password.equals("admin1")){
                //access to system
                System.out.println("Accessing to the system");
                loginFrame.dispose();
                AdminScreen as = new AdminScreen();
            }else {
                //now we should give some errors to the user and delete the password field
                passwordField.setText("");
                JOptionPane.showMessageDialog(null, "You have entered wrong name/password please try again!");
            }
        });
    }


}
