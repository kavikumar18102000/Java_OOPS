package Interfaces.Extending_interfaces;

public interface A {
    void morning();


    //This feature enables us to implement method with its body inside an interface. But no need to override the
    // default method.
    /*
    If you have default method in an interface, it is not mandatory to override (provide body) it in the classes that
    are already implementing this interface. In short, you can access the default methods of an interface using the
    objects of the implementing classes.
     */
    default void fun(){
        System.out.println("I am a default function..");
    }
}
