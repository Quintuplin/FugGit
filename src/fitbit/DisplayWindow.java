package fitbit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class DisplayWindow implements ActionListener {

    private JPanel displayPanel;
    private JLabel time, date, heartrate, steps, activity, caloriesBurned;
    private JButton sideButton;
    private JButton frontButton;
    private JButton senseStep;
    private JButton senseBeat;

    //one instance of everything, kept here
    private Controller controller = new Controller();

    //constant updates
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    private DisplayWindow() {
        //create window
        JFrame displayFrame = new JFrame("FITBIT DEMO");
        displayFrame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        displayFrame.setSize(new Dimension(600, 600));

        //create and set up panel
        displayPanel = new JPanel(new GridLayout(10, 10));

        //add widgets
        addWidgets();

        //add panel to window
        displayFrame.getContentPane().add(displayPanel, BorderLayout.CENTER);

        //display the window
        displayFrame.pack();
        displayFrame.setVisible(true);
    }

    private void addWidgets() {
        //labels
        time = new JLabel("Time", SwingConstants.CENTER);
        date = new JLabel("Date", SwingConstants.CENTER);
        heartrate = new JLabel("Heart Rate", SwingConstants.CENTER);
        steps = new JLabel("Steps", SwingConstants.CENTER);
        activity = new JLabel("Activity", SwingConstants.CENTER);
        caloriesBurned = new JLabel("Calories Burned", SwingConstants.CENTER);

        //buttons
        sideButton = new JButton("Side Button (left arrow)");
        frontButton = new JButton("Front Button (right arrow)");
        senseStep = new JButton("Sense Step (V key)");
        senseBeat = new JButton("Sense Beat (B key)");
        sideButton.setMnemonic(KeyEvent.VK_LEFT);
        sideButton.addActionListener(this);
        frontButton.setMnemonic(KeyEvent.VK_RIGHT);
        frontButton.addActionListener(this);
        senseStep.setMnemonic(KeyEvent.VK_V);
        senseStep.addActionListener(this);
        senseBeat.setMnemonic(KeyEvent.VK_B);
        senseBeat.addActionListener(this);

        //pop it all to the container
        displayPanel.add(sideButton);
        displayPanel.add(frontButton);
        displayPanel.add(senseStep);
        displayPanel.add(senseBeat);
        displayPanel.add(time);
        displayPanel.add(date);
        displayPanel.add(heartrate);
        displayPanel.add(steps);
        displayPanel.add(activity);
        displayPanel.add(caloriesBurned);

        //hide the things that should be hidden
        date.setVisible(false);
        heartrate.setVisible(false);
        activity.setVisible(false);
        caloriesBurned.setVisible(false);

        //start the updates
        this.update();
    }

    public void actionPerformed(ActionEvent event) {
        //change menu
        if (event.getSource() == sideButton) {
            System.out.println("SIDE BUTTON PRESSED");

            if (time.isVisible()) {
                time.setVisible(!time.isVisible());
                steps.setVisible(!steps.isVisible());
                date.setVisible(!date.isVisible());
                activity.setVisible(!activity.isVisible());
            } else if (date.isVisible()) {
                date.setVisible(!date.isVisible());
                activity.setVisible(!activity.isVisible());
                heartrate.setVisible(!heartrate.isVisible());
                caloriesBurned.setVisible(!caloriesBurned.isVisible());
            } else if (heartrate.isVisible()) {
                heartrate.setVisible(!heartrate.isVisible());
                caloriesBurned.setVisible(!caloriesBurned.isVisible());
                time.setVisible(!time.isVisible());
                steps.setVisible(!steps.isVisible());
            }
        } else if (event.getSource() == frontButton) {
            System.out.println("FRONT BUTTON PRESSED");
        } else if (event.getSource() == senseBeat) {
            System.out.println("BEAT DETECTED");
        } else if (event.getSource() == senseStep) {
            System.out.println("STEP DETECTED");
        }
    }

    //updates
    private void update(){
        final Runnable updoot = new Runnable() {public void run() { getData(); }};
        final ScheduledFuture<?> updootHandle = scheduler.scheduleAtFixedRate(updoot, 250, 250, TimeUnit.MILLISECONDS);
    }

    //get data
    private void getData(){
        time.setText("Time: " +controller.getTime());
        date.setText("Date: " +controller.getDate());
        heartrate.setText("Heartrate: " +controller.getHeartrate());
        steps.setText("Steps: " +controller.getSteps());
        activity.setText("Active %: " +controller.getActivity());
        caloriesBurned.setText("Calories Burned: " +controller.getCalories());
    }

    //create and display window
    private static void showGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        DisplayWindow window = new DisplayWindow();
    }
    public static void runUI() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {public void run() { showGUI(); }});
    }
}