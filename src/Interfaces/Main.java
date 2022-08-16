package Interfaces;

public class Main {
    public static void main(String[] args) {
        car c1 = new car();
        c1.accc();
        c1.start();

        //reference variable of type interface and object of type class.
        Engine c2 = new car(); //--> allowed

//        c2.a; --> but we can't access the variable inside the class.
        /*
        Why we can't access the variable inside the implemented class if the reference variable is of type interface ?
        --> It so because, what to access is specified by the reference variable and which one to access is specified
         by the object.This is also known as Dynamic Method dispatch.

         In the above code, the reference is of type interface 'Engine' and instance is of type car.
         we are trying to access the variable 'a' which is inside the class but not in the interface.

         so, we are telling what type  to access, it checks in the interface weather 'a' is present are not, if it is
         present then the object specifies where to access the variable, means it should be accessed in the object.
         If it is not present in the interface, the compiler will not know what to access, so we can't access the
         data members which are not present in the reference variable class or interface. If we want to access, it
         should be present in both the reference variable class or interface and the object also.

         NOTE --> It applies not only for interfaces but also for the classes.
         */




        /*
        In an interface, you can’t instantiate variables and create an object.
         */
//        Engine e1 = new Engine(); --> not allowed


        /*
        If we do like this, actually the engine should start, the media player will start to play.

        Why this happens ? If the reference is of engine then the engine should start why the media player starts ?
        --> we know that both the interfaces have the same methods start(), and implemented the start in the class.
        If the same function is implemented in the class, then that only will be called, we can't create different
        methods. This is where the problem arise when we same methods with same signatures and implementing.

        How to solve this problem ?
        --> Then we should create diff class for diff interfaces and use them.

         */
        Engine c3 = new car();
        c3.start();



    }
}
