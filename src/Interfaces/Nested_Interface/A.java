package Interfaces.Nested_Interface;

public class A {

    //creating an interface inside a class...
    //the nested interface can be private, protected or public
    //but the top level interface(declared as an interface) can only be public not private or protected..
    //nested interface is access using the "classname.interface_name"
    public interface nested_interface{
        void greet();
    }

    public static void main(String[] args) {
        B b = new B();
        b.greet();
    }
}

class B implements A.nested_interface{

    @Override
    public void greet() {
        System.out.println("I am good. How are you...");
    }
}
