package withStrategyPattern;

import withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    //this is known as constructor object
    Vehicle(DriveStrategy driveObject){
        this.driveObject = driveObject;
    }
    public void drive() {
        driveObject.drive();
    }
}
