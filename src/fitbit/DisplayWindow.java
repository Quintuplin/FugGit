package fitbit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DisplayWindow implements ActionListener{

    JFrame displayFrame;
    JPanel displayPanel;
    JLabel timeHours, timeMinutes, timeSeconds, dateDays, dateMonths,
            dateYears, heartrate, steps, activity, caloriesBurned;
    JButton sideButton;
    JButton frontButton;
    JButton senseStep;
    JButton senseBeat;

    public DisplayWindow(){
        //create window
        displayFrame = new Jframe("FITBIT DEMO");
        displayFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        displayFrame.setSize(600,600);

        //create and set up panel
        displayPanel = new JPanel((new GridLayout(6,6)));

        //add widgets
        addWidgets();

        //set default button?
        displayFrame.getRootPane().setDefaultButton((frontButton));

        //add panel to window
        displayFrame.getContentPane().add(displayPanel, BorderLayout.CENTER);

        //display the window
        displayFrame.pack();
        displayFrame.setVisible(true);
    }


    private void addWidgets(){
        //create widgets
        WORKING ON IT
    }

}
