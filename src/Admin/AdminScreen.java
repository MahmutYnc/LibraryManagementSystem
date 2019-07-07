package Admin;

import javax.swing.*;
import java.awt.*;

public class AdminScreen extends JFrame {

    JTabbedPane tp = new JTabbedPane();

    public AdminScreen() throws HeadlessException {
        Dimension dimension = new Dimension(640,480);
        setLayout(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
        setPreferredSize(dimension);
        setResizable(false);
        setLocation(350,100);
        setFocusable(true);
        setVisible(true);

        tp.setBounds(0,0,getWidth(),getHeight());
        
    }
}
