package Abstract_Classes;

/*

* If a class contains more than one abstract class, it must be defined as abstract class.
* The abstract methods will not have the body of the function, it will only be defined.
* The subclass which extends the base abstract-class must and should override the abstract methods.
* The body of the abstract methods are defined in the subclass.
* An abstract class can have a constructor and can be called in the subclass only.
* It can also have the variables.
* An instance of an abstract class cannot be created.

 */

/*
Why object cannot be created for an abstract class ?
Ans:- If we create an object of an abstract class and if we call the abstract methods, it will throw an error as the
body of the abstract method is not defined only. So, the creation object of an abstract class is not allowed.
 */

public abstract class Parent {

    int age;//an abstract class can have a variable
    final int value; //we can have final variables
    static int num; //we can have static variable;

    public Parent(int age) { //Yes, an abstract class can have a constructor also..
        this.age = age;
        value = 12343;
        num+=1;
    }

   /* abstract Parent(){

    }

    An abstract constructor also we can't create. Why?
    Ans: an abstract class cannot be instantiated, it can be done by the use of derived class(subclass).

    */

    abstract void name();
    abstract void career();

    /*

    abstract static name(); --> not allowed

    why we can't make an abstract method static ?
    Ans:- we know that the abstract methods must be overridden, but a static method cannot be overridden.
         so we can't create an abstract static method.

      NOTE :
      we know that static is independent of objects, then the abstract static methods also independent of objects
      right, then it should work, but not working why ?
      This is so because, the rule abstract method is that an abstract method should and must be overridden, but a
      static method cannot be overridden, so an abstract static method is not at all possible to implement.

    */

    /*
    Can we create an static method in an abstract class which not an abstract method?
    Ans:- Yes, we can. we know that static is independent of the object, so it is accessible. But an abstract static
    method is not possible.
     */
    public static void greet(){
        System.out.println("Hi! Good morning....");
    }

    /*
    can we create a normal method ?
    Ans: Yes we can.
     */
    public void normal_method(){
        System.out.println("I am a normal method..");
    }

    /*
    can a abstract class be final ? like "final abstract class Parent{}"
    Ans: No, we can't, because we know that an abstract class must be inherited, but  a final class cannot be
    inherited so, this is not done..
     */

    /*
    we can create a final method, but it is of no use as it cannot be overrided.
    As same as a final abstract method also cannot be created.
    we can also have a final variables.It is allowed
     */
    final public void gtt(){
        System.out.println("I am final method..");
    }

    /*
    can we make multiple inheritance of abstract classes ?
    Ans: No, as still the abstract class supports normal methods defining, normal variables declaration etc...
     */
}
