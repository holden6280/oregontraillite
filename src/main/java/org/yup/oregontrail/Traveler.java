package org.yup.oregontrail;

public class Traveler {

    private String name;
    private int health;
    private boolean isHealthy;
    private int food;

    public Traveler(String name, int health, int food) {
        this.name = name;
        this.health = health;
        this.food = food;
        this.isHealthy = true;
    }

    public String hunt() {
        //user needs to hunt

        //they have a 50% chance of being successful
        if (Math.random() > .5) {

            //if they are successful we add 100 to their food and 0 if not
            this.setFood(this.food + 100);

            return this.getName() + "'s hunt was successful! They now have " + this.getFood() + " food.";
        }
        return this.getName() + "'s hunt was unsuccessful! Their food store remains at only " + this.getFood() + ".";

    }

    public String eat(){

        //Consumes 20 of the traveler's food. If the Traveler has
        if(this.getFood() >= 20){
            this.setFood(this.getFood() - 20);
            this.setHealthy(true);
            this.setHealth(this.getHealth() + 30);
            return "Much better!";
        }else{
            this.setHealthy(false);
            this.setHealth(this.getHealth() - 10);
            return "Your stomach rumbles echo through the desert...";
        }

    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public boolean isHealthy() {
        return isHealthy;
    }
    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
}