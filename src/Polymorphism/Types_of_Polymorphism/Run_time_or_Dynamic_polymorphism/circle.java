package Polymorphism.Types_of_Polymorphism.Run_time_or_Dynamic_polymorphism;

public class circle extends shapes{

//    this is known as method-overriding...

/*
What is method overriding ?
A method is used in the child class as same as the parent class, only the body of the method is changed.
 */

    @Override
    void area(){
        System.out.println("Pi * r * r");
    }
}
