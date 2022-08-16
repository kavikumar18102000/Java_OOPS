package Interfaces.private_modifier;

public interface A {

    // Yah! we can create a private method in interface, but it cannot be overridden in the subclass.
    //private method should be accessed indirectly using a method of that interface itself. Here we care using the
    // default method to do this work..
    private void greet(){
        System.out.println("I am an private access specifier in the interface...");
    }

    default void add(){
        greet();
    }
}
