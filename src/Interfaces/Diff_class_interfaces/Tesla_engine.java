package Interfaces.Diff_class_interfaces;

import Interfaces.Engine;

public class Tesla_engine implements Engine {

    @Override
    public void accc() {

    }

    @Override
    public void stop() {
        System.out.println("Tesla engine is gonna stop running..");
    }

    @Override
    public void start() {
        System.out.println("I am am Tesla engine..");
    }
}
