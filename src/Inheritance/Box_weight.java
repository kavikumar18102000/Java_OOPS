package Inheritance;

public class Box_weight extends Box{
    double weight;

    public Box_weight() {
        this.weight = -1;
    }


    /*
     This is same as  like this --> Box b5 = new Box_weight(2,4,6,7);
     */
    public Box_weight(Box_weight other) {
        super(other);
        this.weight = weight;
    }

    public Box_weight(double l, double w, double h, double weight) {

//        Why super keyword is used?
//        super keyword is used to access the objects of the superclass(parent class).

        super(l, w, h); //what is this? call the parent class constructor and used to initialize values present in the
        // parent class.
//        'super' keyword is used to access the base class constructor.
        /*
        Here the Box_weight has the 'Box' class as the super class, so the super keyword points to the 'Box' class.
        If this class is not a subclass, the superclass is the object of this class.
         */

        this.weight = weight;

//        Another user of super keyword.
        System.out.println(super.h); // we can access the variable present in the super class.

//        we can also access the superclass functions other than constructor.
        double b = super.add();
        System.out.println("The perimeter of the given values are :"+ b);


    }
}
