package fitbit;

/**
 * ActivityCalories.java
 * Team Hungry
 * CSCI 360-01
 * Calculates Activity Ratio and Calories Burned
 */

public class ActivityCalories {
    //intent to vary
    private float activity = 0;
    private float aBPM = 0;
    private int i = 0;


    //finds average BPM for current timeframe (relative to current day or last reset)
    private float averageBPM(StepsHeartrate stepsHeartrate){
        aBPM += (stepsHeartrate.getBPM() - aBPM) / ++i;
        return aBPM;
    }

    //Calculates the amount of calories burned in current day
    //the formula is extremely questionable and gets quite significantly varying results
    //if the calories value displayed is incorrect, it is the fault of this formula
    //however, I found it online, so it must be correct
    //http://www.shapesense.com/fitness-exercise/calculators/heart-rate-based-calorie-burn-calculator.shtml
    //also BPM is a float for no reason
    private double calculateCalories(int age, double weight, boolean isMale, float BPM, double time){
        if (isMale){
            double V02Max = ((-55.0969 + (.6309 * BPM) + (.1988 * weight) + (.2017 * age)) / 4.184) * 60 * time;
            return ((-95.7735 + (.634 * BPM) + (.404 * V02Max) + (.394 * weight) + (.271 * age)) / 4.184) * 60 * time;
        } else{ //if female
            double V02Max = ((-20.4022 + (.4472 * BPM) + (.1263 * weight) + (.074 * age)) / 4.184) * 60 * time;
            return ((-59.3954 + (.45 * BPM) + (.380 * V02Max) + (.103 * weight) + (.274 * age)) / 4.184) * 60 * time;
        }
    }

    //Gets calories from ActivityCalories and updates it at the same time
    public double getCalories(UserData userData, Clock clock, StepsHeartrate stepsHeartRate, double stoptime){
        //parsing my time string because time is passsed as a mixed alphanumeric string rather than a number
        //because that's smart
        double time = Double.parseDouble(clock.currentTime().substring(0,2))
                + Double.parseDouble(clock.currentTime().substring(3,5)) / 60
                + Double.parseDouble(clock.currentTime().substring(6,8)) / (60 * 60);

        //ain't that just a beautiful return statement? I thought so too
        //it simultaneously pulls data from an external class, sends it to a different local method, then returns that value--all in one line
        return calculateCalories(userData.getAge(), userData.getWeight(), userData.getSex(), averageBPM(stepsHeartRate), time - stoptime);
    }

    //if BPM is over 100 add to activity and return activity
    //activity is a percentage based goal to total exercise timer per day/reset
    public float getActivity(){
        if (Sensors.BPSCheat() > 100)
            if (activity < 99.95) {
                activity += (.01);
            }else activity = 100;
        return activity;
    }

    //Meant for when the time hits midnight and all values need to be reset
    //or manual reset
    public void reset(){
        activity = 0;
        aBPM = 0;
        //calories are reset by updating clock's reference time within the clock method
    }
}