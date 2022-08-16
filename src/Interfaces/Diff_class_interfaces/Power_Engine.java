package Interfaces.Diff_class_interfaces;

import Interfaces.Engine;

public class Power_Engine implements Engine {
    @Override
    public void accc() {
        System.out.println("Power engine is getting accelerated..");
    }

    @Override
    public void stop() {
        System.out.println("The power engine is gonna stop..");
    }

    @Override
    public void start() {
        System.out.println("I am a power engine and I am gonna start..");
    }
}
