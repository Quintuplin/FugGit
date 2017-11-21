package fitbit;

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
    void setUserData(int h, int w, int a, boolean s){
//        UserData.setHeight(h);
//        UserData.setWeight(w);
//        UserData.setAge(a);
//        UserData.setSex(s);
    }

    double getTimeData(){
        return ClockData.getTimeData();
    }
}
