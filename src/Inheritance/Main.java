package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box b1 = new Box();
//
//        Box b3 = new Box(10);
//
//        Box b2 = new Box(b3);
//        System.out.println(b2.h+" "+b2.w+" "+b2.l);

//        A base class(parent class) cannot access the properties of a subclass(child clas), but a child class can
//        access the properties of the base class.
//        A subclass cannot access the 'private members' of the base class...

        Box_weight bw1 = new Box_weight(2,4,3,10);


        //        Box_weight bw2 = new Box(10,3,5); // no! you can't do like this..
//        System.out.println(bw2.h);

        /*
        Here we can't create the reference variable of a subclass and the assign the parent class object. No it won't
         work.

         Why it won't work ?
         Because, one you are trying to access should be initialised, but here you are initialising the base class but
          not the subclass, hence you get an error.

          But how can you access the subclass object from the base class reference ?
          Here we are initialising the base class variables and members from the subclass using the 'super' keyword.
          By using the super keyword the base class constructor is called to initialise the base class.

          But from the base class we cannot call the subclass constructor to initialise the members of the subclass.
          so we can't access the subclass, when the reference of type subclass and the object is of type base.
         */



/*
we can create a reference variable of a base class and can assign the object of the subclass.
 */
        Box b5 = new Box_weight(2,4,6,7);//if we do like this, we can only access the overridden methods in child
        // class and we can access the parent class methods and variables. If a new method is implemented in the child
        // class, then we can't access it by using the parent class reference.

        System.out.println(b5.l);
    }
}
