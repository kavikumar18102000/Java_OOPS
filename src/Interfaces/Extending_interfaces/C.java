package Interfaces.Extending_interfaces;

public interface C {
    default void fun(){
        System.out.println("I am in C");
    }
}
