package boogie.diceondemand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIController{
    JFrame frame = new JFrame();
    JLabel fieldtext = new JLabel("Faces on Dice:-");
    JLabel heading = new JLabel("Dice on Demand");
    JButton clicker = new JButton("Roll");
    JTextField field = new JTextField("6");

    public UIController(){

        heading.setBounds(105,0,240,30);
        clicker.setBounds(135,65,180,90);
        fieldtext.setBounds(105,190,240,30);
        field.setBounds(150,220,150,30);

        heading.setFont(new java.awt.Font("Arial", Font.BOLD,28));
        clicker.setFont(new java.awt.Font("Arial", Font.BOLD,24));
        field.setFont(new java.awt.Font("Arial", Font.PLAIN,18));
        fieldtext.setFont(new java.awt.Font("Arial", Font.PLAIN,18));

        frame.add(field);
        frame.add(clicker);
        frame.add(heading);
        frame.add(fieldtext);
        frame.setTitle("Dice on Demand");
        frame.setResizable(false);
        frame.setSize(450,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clicker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        clicker.setBackground(Color.CYAN);

        field.setColumns(4);

    }
}
