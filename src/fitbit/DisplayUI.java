package fitbit;

/**
 * DisplayUI.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: TO READ FROM DISPLAY READY DATASET
 *      TO DYNAMICALLY DISPLAY THE DATA
 *      TO ENABLE SETTINGS CHANGES
 *  OTHER:
 *      1) CALLS DATAIO ON DISPLAY READY DATASET, DISPLAYS DATA
 *      2) CALLS DATAIO ON SETTINGS DATASET, ALTERS DATA, SUBMITS CHANGES
 *
 *      RDD: CALLS INFORMATION EXPERT
 */
public class DisplayUI {
    static int menu = 0;
    static int menub = 0;
    public static void main(String[] args) {
        //initScreen(); //starts the simulation
        while(true) {
            dataDisplay(); //displays the currently selected menu
            buttonListen(); //listens for button presses
        }

    }

    public void DisplayUI(){
        menu = 0;
        menub = 0;
    }

    //output data to display
    private static void dataDisplay(){
        if (menu ==0){
            int time = ClockData.getTimeData();
            int date = ClockData.getDateData();
            // int steps = StepBPSData.getSteps();
            //Call Java swing method that displays menu 1 taking in steps time and date as parameters
            //display menu 1; clock, heartrate, steps?
        }
        else if (menu == 1){
            //display menu 2;
        }
        else if (menu ==2){
            //display menu 3;
        }
        else if (menu == 3);
        //goes on for each menu
    }

    //listen for button press
    private static void buttonListen(){
        if (true){//button1press
            menu = menu++%4;
            menub = 0;
            dataDisplay();
        }
        if (false){//button2press
            if(false){//button2hold placeholder if statement
                //enter edit mode
            }else{//button2tap
                //alter secondary menu
                menub++;
            }
        }
    }
        //if button press, alter menu

}
