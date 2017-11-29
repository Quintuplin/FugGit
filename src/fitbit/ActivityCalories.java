package fitbit;

/**
 * ActivityCalories.java
 * Team Hungry
 * CSCI 360-01
 * Calculates Activity Ratio and Calories Burned
 */

public class ActivityCalories {
    private float activity = 0;

    private float aBPM = 0;
    private int i = 0;


    //finds average BPM for current day
    private float averageBPM(StepsHeartrate stepsHeartrate){
        aBPM += (stepsHeartrate.getBPM() - aBPM) / ++i;
        return aBPM;
    }

    //Calculates the amount of calories burned in current day
    private double calculateCalories(int age, double weight, boolean isMale, float BPM, double time){
        System.out.println(time);
        if (isMale){
            double V02Max = ((-55.0969 + (.6309 * BPM) + (.1988 * weight) + (.2017 * age)) / 4.184) * 60 * time;
            return -((-95.7735 + (.634 * BPM) + (.404 * V02Max) + (.394 * weight) + (.271 * age)) / 4.184) * 60 * time;
        } else{ //if female
            double V02Max = ((-20.4022 + (.4472 * BPM) + (.1263 * weight) + (.074 * age)) / 4.184) * 60 * time;
            return -((-59.3954 + (.45 * BPM) + (.380 * V02Max) + (.103 * weight) + (.274 * age)) / 4.184) * 60 * time;
        }
    }

    //Gets calories from ActivityCalories and updates it at the same time
    public double getCalories(UserData userData, Clock clock, StepsHeartrate stepsHeartRate, double stoptime){
        double time = Double.parseDouble(clock.currentTime().substring(0,2))
                + Double.parseDouble(clock.currentTime().substring(3,5)) / 60
                + Double.parseDouble(clock.currentTime().substring(6,8)) / (60 * 60);
        return calculateCalories(userData.getAge(), userData.getWeight(), userData.getSex(), averageBPM(stepsHeartRate), time - stoptime);
    }

    //if BPM is over 100 add to activity and return activity
    public float getActivity(){
        if (Sensors.BPSCheat() > 100)
            if (activity < 99.95) {
                activity += (.01);
            }else activity = 100;
        return activity;
    }
}