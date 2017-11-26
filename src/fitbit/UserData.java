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
    private char sex;


    public UserData(){
        age = 0;
        weight = 0;
        height = 0;
        sex = 'n';
    }
    public UserData(int age, int weight, int height, char sex){
        this.sex = sex;
        this.weight= weight;
        this.height = height;
        this.age = age;
    }

    public boolean isEmpty(){
        if (age == 0 && weight ==0 && height == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void setUserData(int a, int w, int h, char s){
        setAge(a);
        setWeight(w);
        setHeight(h);
        setSex(s);
    }



    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public char getSex(){return sex;}

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
