package fitbit;

/**
 * StepsHeartrate.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: STORES STEP AND BPS DATA
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
