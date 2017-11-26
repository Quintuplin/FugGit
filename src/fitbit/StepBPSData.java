package fitbit;

/**
 * StepBPSData.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: STORES STEP AND BPS DATA
 *      1) MAINTAINS THE DATASET
 *      2) RESETS AT MIDNIGHT
 *      3) PASSES DATA ON WHEN ASKED
 */

public class StepBPSData {
    private int steps;
    private  int [] bps;
    private int avgBPM;

    public StepBPSData(){
        steps = 0;
        int bps[];
        bps = new int [5];
        for(int i = 0; i < 5; i++){
            bps [i] = 0;
        }
        avgBPM = 0;
    }

    private void setBpsData(){
        int sum = 0;
        int bps[];
        bps = new int [5];
        for(int i = 0; i < 5; i++) {
            bps[i] = StepBPS.BPSCheat();
            sum = sum + bps[i];
        }
        avgBPM = sum/5;
    }

    public int getBPS() {
        setBpsData();
        return avgBPM;
    }

    private void setSteps(){
        steps = steps + StepBPS.stepCheat();
    }

    public int getSteps() {
        setSteps();
        return steps;
    }
}
