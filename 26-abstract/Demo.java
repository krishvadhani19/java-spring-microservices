
abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Inside play music");
    }
}

class WagonR extends Car {

    @Override
    public void drive() {
        System.out.println("Inside drive method in WagonR which extends Car");
    }

    @Override
    public void fly() {
        System.out.println("Inside fly method in WagonR which extends Car");
    }
}

public class Demo {

    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}

/*
 * Abstract classes:
 * 1. Abstract classes cannot be instantiated directly
 * 2. It meant to serve as base for other classes
 * 3. Abstract classes may contain both abstract and non-abstract methods
 * 4. The purpose of abstract class is to define properties and behaviors 
 * that derived classes should inherit or override
 * 5. Objects created of abstract classes must override abstract methods
 */
/**
 * Abstract Methods: 1. Abstract methods are declared without any implementation
 * 2. Any class having atleast 1 abstract method must have its class as abstract
 * 3. Subclasses of abstract classes must provide implementation of abstract
 * methods unless the subclass is also abstract
 */
