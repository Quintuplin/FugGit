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
    private boolean isMale;


    public UserData(){
        age = 0;
        weight = 0;
        isMale = true;
    }
    public UserData(int age, int weight, boolean isMale){
        this.isMale = isMale;
        this.weight= weight;
        this.age = age;
    }

    public boolean isEmpty(){
        return (age == 0 || weight ==0);
    }

    public void setUserData(int a, int w, int h, boolean s){
        setAge(a);
        setWeight(w);
        setSex(s);
    }



    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setSex(boolean sex){
        this.isMale = sex;
    }

    public boolean getSex(){return isMale;}

    public int getAge(){
        return age;
    }

    public float getWeight(){
        return weight;
    }
}
