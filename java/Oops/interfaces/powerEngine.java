package Oops.interfaces;

public class powerEngine implements Engine{

    @Override
    public void start() {
    System.out.println("Start the powerEngine");
    }

    @Override
    public void stop() {
    System.out.println("Stop the powerEngine");
    }

    @Override
    public void acc() {
     System.out.println("Accelerate the powerEngine");
    }
    
}
