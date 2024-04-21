package withStrategyPattern;

import withStrategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super ( new SportsDriveStrategy());
    }
}
