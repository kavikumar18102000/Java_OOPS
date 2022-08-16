package Interfaces.Diff_class_interfaces;

import Interfaces.Engine;

public class Arya_car {
    private Engine engine;
    private CD_Player player;
    private Applying_brake brake;

    public Arya_car() {
        this.engine = new Power_Engine();
        this.player = new CD_Player();
        this.brake = new Applying_brake();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void music_start(){
        player.start();

    }

    public void music_stop(){
        player.stop();
    }

    public void upgrade_engine(Engine engine){
        this.engine = engine;
    }
}
