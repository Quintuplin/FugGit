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
    private int age;
    private float weight;
    private float height;

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public int getAge(){
        return age;
    }

    public float getWeight(){
        return weight;
    }

    public float getHeight(){
        return height;
    }
}
