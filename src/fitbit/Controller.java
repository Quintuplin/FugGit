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
    public static void initialize(){
        Clock.init();
        UserData User = new UserData();
        DisplayUI display = new DisplayUI();

        int age = ; //Get age from UI;
        int weight = ; //Get weight from UI
        int height = ; //Get Height from UI
        char sex = ; //Get sex from UI

        //Possibly put the listener into the parameters so we dont have to create extra vars
        User.setUserData(age, weight, height, sex);

        //Display Data
        display.dataDisplay();

        //get userData
        //DataExpert.setUserData(UI.getUserData);
        //get clockData
        //set initial nanotime
        //TEST start generating sensor data
        //initialize Data modules
        //run code
    }
}
