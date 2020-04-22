package boogie.diceondemand;

import javax.swing.*;
import java.awt.*;

public class UIController {

    public UIController(){

        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(500,500));
        frame.setResizable(false);
        frame.setBounds(new Rectangle(500,500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

}
