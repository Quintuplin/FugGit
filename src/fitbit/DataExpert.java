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

    //Gets calories burned from HACData, Needs HACData, UserData and BPSData as params,
    public double getCaloriesBurned(HACData HAC1, UserData u1, Float time){
        double calories = HAC1.getCaloriesBurned(u1, time);
        return calories;
    }

    //Gets steps from StepBPS
    public int getStepData(StepBPSData Step1) {
        int steps = Step1.getSteps();
        return steps;
    }

    //Gets H
    public int getHearRate(HACData HAC1){
        int BPS = HAC1.getHeartRate();
        return BPS;
    }

    int getTimeData(){
        return ClockData.getTimeData();
    }
}
