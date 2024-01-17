package Oops.interfaces;

public class niceCar {
    private Engine engine;
    private Media player = new Cdplayer();


    public niceCar(){
        engine = new powerEngine();
    } 

    public niceCar(Engine engine){
        this.engine = engine;
    }  

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine =  new electricEngine();
    }
}
