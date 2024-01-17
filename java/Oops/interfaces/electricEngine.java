package Oops.interfaces;

public class electricEngine implements Engine {
    @Override
    public void start() {
    System.out.println("Start the electricEngine");
    }

    @Override
    public void stop() {
    System.out.println("Stop the electricEngine");
    }

    @Override
    public void acc() {
     System.out.println("Accelerate the electricEngine");
    }
}
