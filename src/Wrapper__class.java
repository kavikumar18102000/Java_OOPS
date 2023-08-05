
class A{
    final int i=10;
    float marks = 20;


/*   Finalize works the destructor. A destructor removes the object from the heap once the garbage collector is called.

    If a reference variable is referenced to more than one object, the garbage collector is called and frees the space
    in the memory by removing the un assigned object...

    To know the object getting destroyed we use the finalize function..
    Finalize is a default function, it calls itself internally by java, no need of calling by user or programmer.

    Once the variable is referenced to another object, there will be un-referenced object in the memory and the
    garbage collector come into action and removes the objects.

    To know the operation done by the garbage collector we use finalize.

    Garbage collector removes the objects from the memory only if the memory si getting almost filled.

 */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed...");
    }
}

public class Wrapper__class {
    public static void main(String[] args) {

//        Different ways of initializing the wrapper class.
        /*
        As the name says that these are the classes and we are creating the object to it...
        These are final class, where the values cannot be changed.
         */
        Integer i = 5;
        Integer j=new Integer(10);

        Float f = new Float(60.0);

        /*
        In the below function the values will not be changed, as java has only 'call by value', not call by referencing...
         */

        int a=10;
        int b=20;

        swap(a,b);
//        System.out.println(a+" "+b);




//        Final keyword...
        /*
        If a variable is declared as final, we cannot change the value of it. And a final variable should not be left
        empty, a default should be given..
         */

        A a1=new A();
//        a1.i = 50; // cannot assign value to a final variable...


//        Final reference to an object....

        final A a2 = new A();
//        a2.i=20;  // we cannot change the final value
        a2.marks=10; // we can change the value of the variable which are not final..

//        a2 = a1; // we cannot assign the variable reference to another object....

//      Finallize working...

        A ob1; // reference variable is created..

//        Objects gets initializing more than one object..
        for(int k=0;k<1000000;k++){
            ob1=new A();
        }

//        ob1.finalize(); // it is internally called by java, not need of calling explicitly by the user or programmer.



    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a+" "+b);
    }


}
