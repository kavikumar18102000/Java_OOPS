package Interfaces.Diff_class_interfaces;

import Interfaces.Brake;

public class Applying_brake implements Brake {
    @Override
    public void brake() {
        System.out.println("Applying brake to stop the car..");
    }
}
