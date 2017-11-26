package fitbit;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class UI {
    JFrame converterFrame;
    JFrame fitBitFrame;
    JPanel converterPanel;

    public void displayMenu1(){
        fitBitFrame = new JFrame("Fitbit");
        fitBitFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fitBitFrame.setSize(500,500);
        //Display
        fitBitFrame.setVisible(true);
    }

    public void button1(){

        converterFrame = new JFrame("Fitbit");
        converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        converterFrame.setSize(new Dimension(240, 150));
        JButton button = new JButton("I'm a Button1");
        button.setMnemonic('i');
        //Create and set up the panel.
        converterPanel = new JPanel(new GridLayout(5, 5));
        converterFrame.pack();
        converterFrame.setVisible(true);


        //button.addActionListener(/*...create an action listener...*/);
    }



}
