package Interfaces.Default_specifier;

import Interfaces.Extending_interfaces.A;

public interface B {
    void greet();

    /*
    we can have the same default function with same signature in different interfaces.
    But if a class implements both the interfaces then there will be a default method conflict as both the interfaces
     as same default methods.
     If the class is not implementing any one interfaces, then the default method with same signature is acceptable.

     For ex: uncomment the below default function and see. It will throw an error
     */
//    default void fun(){
//        System.out.println("I am a default method in interface B");
//    }
}
