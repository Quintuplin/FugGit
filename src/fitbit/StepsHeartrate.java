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

    //updates BPM based on the past 5 BPS values
    //relies on BPS to not really be PS but instead P5S
    //might be a little unrealistic but it's based off of the sensors model which itself is a little unrealistic
    //and it generates just fine data
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

    //adds steps as sensors detect them
    private void setSteps(){ steps += Sensors.stepCheat(); }

    //getters send data onwards after updating their values
    public int getBPM() {
        setBPM();
        return BPM;
    }

    public int getSteps() {
        setSteps();
        return steps;
    }

    //Resets steps to 0 as requested to by DataExpert
    public void reset(){ steps = 0; }
}
