package Interfaces.Static_in_interfaces;

public interface A {


    /*
    can we use static methods in interface ?
    --> yes we can...

    why the body should be implemented in the static method in interface ?
    --> we know that static methods do not override as it is not dependent on the objects.
    so to use the static methods, must implement the body of that method.

    call static methods via the interface names..
     */
    static void greet(){
        System.out.println("I am an static function in interface A");
    }
}
