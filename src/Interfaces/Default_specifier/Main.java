package Interfaces.Default_specifier;

public class Main implements A,B{
    @Override
    public void morning() {

    }

    @Override
    public void greet() {

    }

    /*
    can we have a function which specified default in interface with the same signature in the class ?
    --> yes we can. And if we access, the function the priority is given to the class not the interface function.
    But the method in the class cannot have a weaker access specifier.
     */
    public void fun(){
        System.out.println("I am fun in class..");
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.fun();
    }
}
