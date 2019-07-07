package Admin;

import javax.swing.*;
import java.awt.*;

public class AdminScreen extends JFrame {

    JPanel panel = new JPanel();

    JButton logout = new JButton("Logout");
    JButton addBtn = new JButton("Add");
    JButton deleteBtn = new JButton("Delete");

    JTable table = new JTable();

    JLabel name = new JLabel("Name");
    JLabel password = new JLabel("Password");
    JLabel email = new JLabel("E-Mail");
    JLabel address = new JLabel("Address");
    JLabel city = new JLabel("City");
    JLabel contact = new JLabel("Contact");

    JTextField namef = new JTextField("Name");
    JTextField passwordf = new JTextField("Password");
    JTextField emailf = new JTextField("E-Mail");
    JTextField addressf = new JTextField("Address");
    JTextField cityf = new JTextField("City");
    JTextField contactf = new JTextField("Contact");

    public AdminScreen() throws HeadlessException {
        Dimension dimension = new Dimension(640,480);


        panel.setLayout(null);

        panel.add(name);
        name.setBounds(20,20,50,20);
        name.setLocation(20,20);
        panel.add(password);
        password.setBounds(20,20,50,20);
        password.setLocation(20,40);
        panel.setBackground(Color.decode("#7aacfa"));


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
        setPreferredSize(dimension);
        setResizable(false);
        setLocation(350,100);
        setFocusable(true);
        setVisible(true);

    }
}
