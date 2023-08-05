package Interfaces;

/*
The interface cannot contain concrete(with implementation) methods
In Interface only one specifier is used that is Public.
In interfaces the variables will only be static or final.
In interfaces variables must be initialized and cannot be empty.
 */

/*
The concept of multiple inheritance is achieved using the interface.

Can the diff interfaces have the same methods ?
--> Yes they can have. But how can they managed if they are same.
    If the interfaces have the same methods, however they are overrided and the method is implemented with the same
    name, so there will no error occurred.
 */

public interface Engine {
    static final int PRICE = 345000;

//    public int num; -->not allowed
    public  int num = 20; //--> allowed

    void accc();
    void stop();

//    interface having the same methods in diff interfaces. But no conflicts will arise as the function is overrided
//    and implemented..

    void start();

/*  f the two interfaces contain the same function signatures but if the return type is diff, then it is
    impossible to implement the methods..
    int start(); -->not allowed

    why it is not allowed ?
    --> we know that methods with same name and diff signatures are called as method overloading, but we can't
    perform method overloading in the interfaces and abstract classes. we can only perform method overriding.

 */

}
