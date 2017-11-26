package fitbit;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

/**
 * DataExpert.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: TO GRANT ACCESS TO ALL PERTINENT DISPLAY-READY DATA
 *      1) STEPS AND BPS DATASET
 *      2) CURRENT TIME FROM CLOCK CLASS
 *      3) CALCULATED DATA DATASET (HEARTRATE, ACTIVE RATIO, CALORIES BURNED)
 *
 *      WHAT IS PASSED BY THE SETTINGS EXPERT (ELSEWHERE)
 *      1) CLOCK SETTINGS DATASET
 *      2) USER INFORMATION DATASET
 */

public class DataExpert {


    public int getStepData(StepBPSData step) {
        int steps = step.getSteps();
        return steps;
    }

    public int getBPSData(){
        StepBPSData BPS1 = new StepBPSData();
        int BPS = BPS1.getBPS();
        return BPS;
    }

    int getTimeData(){
        return ClockData.getTimeData();
    }
}
