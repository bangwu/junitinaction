package com.thoughtworks.lesson.five;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class Vehicle {
    Driver driver;
    boolean hasDriver = true;

    public Vehicle(Driver driver) {
        this.driver = driver;
    }

    private void setHasDriver(boolean hasDriver){
        this.hasDriver = hasDriver;
    }
}
