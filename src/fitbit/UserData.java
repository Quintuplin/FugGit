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
    private int weight;
    private int height;
    private boolean sex;

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setHeight(int height){
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
