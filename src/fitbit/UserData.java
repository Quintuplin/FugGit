package fitbit;

/**
 * UserData.java
 * Team hungry
 * CSCI 360-01
 * Stores User's information (for ActivityCalories calculations)
 */

class UserData {
    private int age;
    private int weight;
    private boolean isMale;

    public UserData(){
        age = 0;
        weight = 0;
        isMale = false;
    }

    //setter
    public void setUserData(int age, int weight, boolean sex){
        this.age = age;
        this.weight = weight;
        this.isMale = sex;
    }

    //getters
    public boolean getSex(){return isMale;}

    public int getAge(){return age;}

    public float getWeight(){return weight;}
}
