package Interfaces.Diff_class_interfaces;

import Interfaces.Media_player;

public class CD_Player implements Media_player {
    @Override
    public void start() {
        System.out.println("The song starts to play");
    }

    @Override
    public void stop() {
        System.out.println("The song stops to play");
    }
}
