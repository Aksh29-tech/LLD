package withStrategyPattern.strategy;

public class XyzDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Xyz Drive Capability");
    }
}
