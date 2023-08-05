package Inheritance;

public class Box {
    double l;
    double w;
    double h;

    public Box() {
        //here Box has no super class, the object itself is the superclass, the super keyword points to the object
        // itself.
        super(); //super class points the object of the same class.
        /*
        Class Object is the root of the class hierarchy. Every class has 'Object' as a superclass.
         */

        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    public Box(double l) {
        this.l = l;
        this.h=l;
        this.w=l;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    //    This is also known copy constructor
    /*
    What is copy constructor ?
    A constructor creating an instance by taking the object of the same class as an argument.
     */

    public Box(Box b){
        this.l=b.l;
        this.h=b.h;
        this.w=b.w;
    }

    public double add(){
        double peri;
        peri = this.h+this.w+this.l;
        return peri;
    }

}
