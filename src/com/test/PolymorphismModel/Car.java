package com.test.PolymorphismModel;

// similar to abstract, here uses implements instead of extends
public class Car implements Vehicle{

    private int currentSpeed;
    public Car(){

    }

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {

        System.out.println("start engine");
        this.currentSpeed += amount;
        System.out.println("Accelerated by" + this.currentSpeed);
    }

    @Override
    public void applyBreaks(int amount) {
        this.currentSpeed -=amount;
    }

    @Override
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

}
