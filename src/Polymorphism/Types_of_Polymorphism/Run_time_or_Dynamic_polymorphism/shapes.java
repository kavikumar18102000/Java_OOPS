package Polymorphism.Types_of_Polymorphism.Run_time_or_Dynamic_polymorphism;

public class shapes {
    void area(){
        System.out.println("I am a area function");
    }

    /*
    default void add(){
        System.out.println("I am an add function....");
    }

    The above method cannot accessed as the default method are defined in the interfaces.
     */


    /*
    what if the super class methods are protected ? Do they override by the subclass?
    Ans :- If the super class methods are protected they can be over-ridden by the subclass.But the
    subclass overridden methods must be public or protected (but not private or default) which means the
    subclass overridden methods cannot have a weaker access specifier.(private and default are weaker
    access specifier).

    can a default method overridden ? (default method are defined in the interfaces)
    Ans:- A default method is overridden if the class implements the interface. Otherwise the default
    methods are not necessary to override.

     */
}
