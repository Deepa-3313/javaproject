package hello;
abstract class Car {
   
    abstract void start();
    abstract void accelerate();
    abstract void brake();
    abstract void stop();
}

class DriverCar extends Car {
   
    void start() {
        System.out.println("Car started with ignition key.");
    }

 
    void accelerate() {
        System.out.println("Car is accelerating using the accelerator.");
    }

    void brake() {
        System.out.println("Car is slowing down using the brake.");
    }

    void stop() {
        System.out.println("Car has stopped.");
    }
}
public class Main{
    public static void main(String[] args) {
        Car myCar = new DriverCar();
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
    }
}

