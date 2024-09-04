package com.test.PolymorphismModel;

public interface Vehicle {
    // can have static methods
    // can have constants
    // methods are abstract & public by ORI
    // means no need to specify public and abstract as they are already by default abstract and public
    void move(int amount);
    void applyBreaks(int amount);
    int getCurrentSpeed();
    double PURCHASE_RATE = 0.5;

    // default method
    // subclasses or implementations no need to implement
    // because can be used by all sub-classes
    // has method body
    default double milesToKm(int speed){
        return speed * 1.609;
    }
}
