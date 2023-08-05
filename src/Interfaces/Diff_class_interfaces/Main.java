package Interfaces.Diff_class_interfaces;

public class Main {
    public static void main(String[] args) {
        Arya_car a1 = new Arya_car();
        a1.start();
        a1.music_start();

        //upgrading the engine..
        a1.upgrade_engine(new Tesla_engine());
        a1.start();
    }
}
