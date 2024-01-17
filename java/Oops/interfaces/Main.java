package Oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();  // Engine u can use instead of Car in lhs ner Car() is the type of object
        // car.acc();
        // car.brake();
        // car.start();
        // car.stop();

        niceCar gadi = new niceCar();
        gadi.start();
        gadi.startMusic();
        gadi.upgradeEngine();  // without create new object u just change the part of the engine
        gadi.start();


 }
}
// twi classes are unrealated to each other can also impliment the same interface