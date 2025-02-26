interface Bike {
    void turnOnEngine();
    void accelerate();
}
class Motorcycle implements Bike {
    boolean isEngineOn;
    int speed;
    @Override
    public void turnOnEngine() {
        //turn on the engine!
        isEngineOn = true;
    }
    @Override
    public void accelerate() {
        //increase the speed
        speed = speed + 10;
    }
}

class Bicycle implements Bike {
    @Override
    public void turnOnEngine() {
         throw new AssertionError("There is no Engine");
    }
    @Override
    public void accelerate() {
         //do something
    }
}
//we are reducing the capability of parent class (Bike) in Bicycle so Liskov Principle is not satisfying here.

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {

    }
}
