package Interfaces.Extending_interfaces;

public interface B extends A{
    void greet();

    //we can default function with same signature...
    default void fun(){
        System.out.println("I am a default method in interface B");
    }
}
