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

    private Controller controller = new Controller();

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

        //set default button?
        displayFrame.getRootPane().setDefaultButton(frontButton);

        //add panel to window
        displayFrame.getContentPane().add(displayPanel, BorderLayout.CENTER);

        //display the window
        displayFrame.pack();
        displayFrame.setVisible(true);
    }

    private void addWidgets() {
        //labels
        time = new JLabel("Time", SwingConstants.LEFT);
        date = new JLabel("Date", SwingConstants.LEFT);
        heartrate = new JLabel("Heart Rate", SwingConstants.LEFT);
        steps = new JLabel("Steps", SwingConstants.LEFT);
        activity = new JLabel("Activity", SwingConstants.LEFT);
        caloriesBurned = new JLabel("Calories Burned", SwingConstants.LEFT);

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

    private void getData(){
        time.setText(controller.getTime());
    }

    private static void showGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        DisplayWindow window = new DisplayWindow();
    }

    public static void runUI() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGUI();
            }
        });
    }

    private void update(){
        final Runnable updoot = new Runnable() {
            @Override
            public void run() {
                getData();
            }
        };
        final ScheduledFuture<?> updootHandle = scheduler.scheduleAtFixedRate(updoot, 250, 250, TimeUnit.MILLISECONDS);
    }
}