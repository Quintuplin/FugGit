package fitbit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
        displayFrame = new JFrame("FITBIT DEMO");
        displayFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        displayFrame.setSize(new Dimension(600,600));

        //create and set up panel
        displayPanel = new JPanel(new GridLayout(6,6));

        //add widgets
        addWidgets();

        //set default button?
        displayFrame.getRootPane().setDefaultButton(frontButton);

        //add panel to window
        displayFrame.getContentPane().add(displayPanel, BorderLayout.CENTER);

        //display the window
        displayFrame.pack();
        displayFrame.setVisible(true);
    }


    private void addWidgets(){

        //labels
        timeHours = new JLabel("Hours", SwingConstants.LEFT);
        timeMinutes = new JLabel("Minutes", SwingConstants.LEFT);
        timeSeconds = new JLabel("Seconds", SwingConstants.LEFT);
        dateMonths = new JLabel("Months", SwingConstants.LEFT);
        dateDays = new JLabel("Days", SwingConstants.LEFT);
        dateYears = new JLabel("Years", SwingConstants.LEFT);
        heartrate = new JLabel("Heart Rate", SwingConstants.LEFT);
        steps = new JLabel("Steps", SwingConstants.LEFT);
        activity = new JLabel("Activity", SwingConstants.LEFT);
        caloriesBurned = new JLabel("Calories Burned", SwingConstants.LEFT);

        //buttons
        sideButton = new JButton("Side Button");
        frontButton = new JButton("Front Button");
        senseStep = new JButton("Sense Step");
        senseBeat = new JButton("Sense Beat");
        sideButton.addActionListener(this);
        frontButton.addActionListener(this);
        senseStep.addActionListener(this);
        senseBeat.addActionListener(this);

        //pop it all to the container
        displayPanel.add(sideButton);
        displayPanel.add(frontButton);
        displayPanel.add(timeHours);
        displayPanel.add(timeMinutes);
        displayPanel.add(timeSeconds);
        displayPanel.add(dateDays);
        displayPanel.add(dateMonths);
        displayPanel.add(dateYears);
        displayPanel.add(heartrate);
        displayPanel.add(steps);
        displayPanel.add(activity);
        displayPanel.add(caloriesBurned);
    }

    public void actionPerformed(ActionEvent event){
        //change menu
    }

    private static void showGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        DisplayWindow window = new DisplayWindow();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                showGUI();
            }
        });
    }
}
