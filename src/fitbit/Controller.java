package fitbit;

/**
 * Controller.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: TO PASS ACCESS FROM UI TO PERTINENT EXPERTS AND VICE VERSA
 *      THE SPIDER IN HER WEB
 *      CONTROLLER PATTERN
 */

public class Controller {
    public void initialize(UserData user){
        Clock.init();
        int age = 49; //Get age from UI PLACEHOLDER FOR NOW
        int weight = 155; //Get weight from UI
        int height = 61; //Get Height from UI
        char sex = 'm'; //Get sex from UI

        //Possibly put the listener into the parameters so we dont have to create extra vars
        user.setUserData(age, weight, height, sex);

        //Display Data
        //display.dataDisplay();

        //get userData
        //DataExpert.setUserData(UI.getUserData);


        //get clockData
        //set initial nanotime
        //TEST start generating sensor data
        //initialize Data modules
        //run code
    }


}
