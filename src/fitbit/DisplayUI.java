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
        initScreen(); //starts the simulation
        while(true) {
            dataDisplay(); //displays the currently selected menu
            buttonListen(); //listens for button presses
        }

    }
    //output data to display
    private static void dataDisplay(){
        if (menu ==0){
            //display menu 1; clock, heartrate, steps?
        }
        else if (menu == 1){
            //display menu 1;
        }
        else if (menu ==2){
            //display menu 2;
        }
        else if (menu == 3);
        //goes on for each menu
    }

    //listen for button press
    private static void buttonListen(){
        if (){//button1press
            menu= menu++%4;
            menub = 0;
        }
        if (){//button2press
            if(){//button2hold placeholder if statement
                //enter edit mode
            }else{//button2tap
                //alter secondary menu
                menub++;
            }
        }
    }
        //if button press, alter menu

}
