package Interfaces;


/*
If a class implements the interfaces and not implementing the methods specified, then the class must be defined as an
 abstract class as follows.
 */
public abstract class car2 implements Engine,Brake,Media_player{

    void grett(){
        System.out.println("Hi, I am an abstract class implementing interfaces");
    }
}
