package Singleton_Class;

/*
 A singleton class allows to create only one object of that class.

 * so we know that constructor creates the object of the class, by making the constructor private it does not allow
 outside the class to create an object.
 * getInstance method return the class by creating only one object for that class.
 * As the static variable "instance" is null, it creates a new object for that variable only once.

 */
public class Singleton_class {
    private Singleton_class() { // making it private it can be accessed only within the class.
    }

    public static Singleton_class instance; // a variable of class "Singleton", and it is null as no object created.

    public static Singleton_class getInstance(){//we should make this function static as we are not creating the
        // instance in the main class
        if(instance==null){ // as the variable is null, an object is created by calling the constructor. If the
            // condition is false it will not call the constructor to create an object of that class.
            instance=new Singleton_class();
        }
        return instance; // returning the instance created.. it returns the same object to different variables, all
        // the variables pointing to the same object.

//         For better understanding please debug the main.java file...
    }

}
