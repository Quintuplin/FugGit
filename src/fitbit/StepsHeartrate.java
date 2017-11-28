package fitbit;

/**
 * StepsHeartrate.java
 * TEAM HUNGRY
 * CSCI 360-01
 * Tracks steps and BPM based on Sensor data
 */

public class StepsHeartrate {
    private int steps = 0;
    private int BPM = 0;

    //setters
    private void setBPM(){
        int sum = 0;
        int bps[];
        bps = new int [5];
        for(int i = 0; i < 5; i++) {
            bps[i] = Sensors.BPSCheat();
            sum += bps[i];
        }
        BPM = sum/5;
    }

    private void setSteps(){
        steps += Sensors.stepCheat();
    }

    //getters
    public int getBPM() {
        setBPM();
        return BPM;
    }

    public int getSteps() {
        setSteps();
        return steps;
    }
}
