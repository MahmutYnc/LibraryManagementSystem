package Admin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AdminScreen extends JFrame {

    JPanel panel = new JPanel();

    JButton logout = new JButton("Logout");
    JButton addBtn = new JButton("Add");
    JButton deleteBtn = new JButton("Delete");

    JTable table;

    JLabel name = new JLabel("Name: ");
    JLabel password = new JLabel("Password: ");
    JLabel email = new JLabel("E-Mail: ");
    JLabel address = new JLabel("Address: ");
    JLabel city = new JLabel("City: ");
    JLabel contact = new JLabel("Contact: ");

    JTextField namef = new JTextField("");
    JTextField passwordf = new JTextField("");
    JTextField emailf = new JTextField("");
    JTextField addressf = new JTextField("");
    JTextField cityf = new JTextField("");
    JTextField contactf = new JTextField("");

    String columnNames[] = {"Name", "Password", "E-mail", "Address", "City", "Contact"};

    public AdminScreen() throws HeadlessException {
        Dimension dimension = new Dimension(640,480);


        panel.setLayout(null);
        panel.setBackground(Color.decode("#7aacfa"));

        panel.add(name);
        name.setBounds(30,100,80,30);
        panel.add(namef);
        namef.setBounds(100,100,80,25);

        panel.add(password);
        password.setBounds(30,140,80,30);
        panel.add(passwordf);
        passwordf.setBounds(100,140,80,25);

        panel.add(email);
        email.setBounds(30,180,80,30);
        panel.add(emailf);
        emailf.setBounds(100,180,80,25);

        panel.add(address);
        address.setBounds(30,220,80,30);
        panel.add(addressf);
        addressf.setBounds(100,220,80,25);

        panel.add(city);
        city.setBounds(30,260,80,30);
        panel.add(cityf);
        cityf.setBounds(100,260,80,25);

        panel.add(contact);
        contact.setBounds(30,300,80,30);
        panel.add(contactf);
        contactf.setBounds(100,300,80,25);

        panel.add(addBtn);
        addBtn.setBounds(325,280,80,30);

        panel.add(deleteBtn);
        deleteBtn.setBounds(445,280,80,30);

        panel.add(logout);
        logout.setBounds(525, 15,80,25);

        this.add(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
        setPreferredSize(dimension);
        setResizable(false);
        setLocation(350,100);
        setFocusable(true);
        setVisible(true);

    }
    public void fillTable(){
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        model.addRow(new Object[]{"s","a","d","e","f","g"});
        table.setModel(model);

    }
    public void connect(){

    }
}
