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
    private  int bps;

    public StepBPSData(){
        steps = 0;
        bps = 0;
    }

    private void setBpsData(){
        bps = StepBPS.BPSCheat();
    }

    public int getBPS() {
        setBpsData();
        return bps;
    }

    public int getSteps() {
        return steps;
    }
}
