package Oops.interfaces;

public class Cdplayer implements Media {

    @Override
    public void start() {
       System.out.println("Start the gana");
    }

    @Override
    public void stop() {
       System.out.println("Stop the music");
    }
    
}
