package Inheritance.Types_of_Inheritance.Hierarchical_Inheritance;

/*
What is Hierarchical Inheritance?
A parent class is inherited by many child classes.

Here, A is the parent class and all the child classes are inherited by a single parent class.

 */


public class A {
    String name;

    public A(String name) {
        this.name = name;
        System.out.println("Hi I am class A");
    }

    public static void main(String[] args) {
        D d1 = new D("Arya");
    }
}

class B extends A{
    String name;

    public B(String name) {
        super(name);
        this.name = name;
        System.out.println("Hi I am B, child of A");
    }
}

class C extends  A{
    String name;

    public C(String name) {
        super(name);
        this.name = name;
        System.out.println("Hi I am C, child of A");
    }
}

class D extends A{
    String name;

    public D(String name) {
        super(name);
        this.name = name;
        System.out.println("Hi I am D, child of A");
    }
}