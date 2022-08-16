package Polymorphism.Types_of_Polymorphism.compile_time_or_static_polymorphism;


/*
In compile time polymorphism, method overloading is known as polymorphism.

what is method overloading ?
Using the same function name, but arguments and return type are changed.

Why it is compile-time polymorphism ?
Because the method which should be called is checked during compile-time.
As there are methods with the same name is defined, the compiler checks which method should be invoked
before the execution of the program.
 */

public class compile_time_or_static {
    int add(int a, int b){
        return  a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

//    int add(int b,int a){} --> this is not possible as in method overloading order is maintained. Here
//    both are of type int only, so compiler gets confused which function to call weather the first or this
//    .(This is done only if data type are same);

    String add(String b,int a){ //this is allowed as the data types are different for both the arguments...
        return a+b;
    }

    double add(double a, int b){
        return a+b;
    }
}
