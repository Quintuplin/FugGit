package fitbit;

/**
 * SettingsExpert.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: TO GRANT ACCESS TO ALL PERTINENT DISPLAY-READY DATA
 *      1) CLOCK SETTINGS DATASET
 *      2) USER INFORMATION DATASET
 *
 *      WHAT IS PASSED BY THE DATA EXPERT (ELSEWHERE)
 *      1) STEPS AND BPS DATASET
 *      2) CURRENT TIME FROM CLOCK CLASS
 *      3) CALCULATED DATA DATASET (HEARTRATE, ACTIVE RATIO, CALORIES BURNED)
 */

public class SettingsExpert {

    public SettingsExpert(){

    }



    public void getUserData(){
    //Dont know how put pull UserData out of the instance of User created in the Controller init without having
        // to either pass a UserData param (defeats the purpose of Settings expert) or creating a new UserData instance (Doesnt have the same var values)
    }
}
