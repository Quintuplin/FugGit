package fitbit;

/**
 * UserData.java
 * AUTHOR: TEAM HUNGRY
 * CLASS: CSCI 360-01
 * PURPOSE: STORES USER'S
 *      1) PASSES DATA ON WHEN ASKED
 *      2) HAS SIMPLE INTERFACE TO ALLOW DATA TO BE STORED
 */

public class UserData {
    private int age = 0;
    private int weight = 0;
    private boolean isMale = false;


    public UserData(){
        age = 0;
        weight = 0;
        isMale = false;
    }

    public UserData(int age, int weight, boolean isMale){
        this.isMale = isMale;
        this.weight= weight;
        this.age = age;
    }

    public boolean isEmpty(){
        return (age == 0 || weight == 0);
    }

    //setter
    public void setUserData(int age, int weight, boolean sex){
        this.age = age;
        this.weight = weight;
        this.isMale = sex;
    }

    //getters
    public boolean getSex(){return isMale;}

    public int getAge(){
        return age;
    }

    public float getWeight(){
        return weight;
    }
}
