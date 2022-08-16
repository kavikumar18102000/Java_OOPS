package Static_Block;

public class Inner_class {

    /*
    A class within another class can also be created.
    The inner class must be static class.
    But the outer class cannot be a static class.
     */

    /*
    Why the inner class are static ?
    As the inner class depend on the outer class object, we should make it like it should not depend on the outer
    class objects. So to do this we make the inner class static so that the inner class will not depend on the outer
    class.

    Once the inner class is defined as  static, there is no need to create an object for the outer class to access
    the inner class.

    On static, the inner class will depend on the outer 'class' not on the outer class objects.

    As static class, variable, and methods are not dependent on the objects, they are initialized during a compile time.
    we know that the objects are created during runtime.
     */
    static class  B{

        static String name;

        public B(String name) {
            B.name=name;
        }

        public void greet(){
            System.out.println("Hello world...");
        }
    }

    public static void main(String[] args) {
        B obj  = new B("arya");
        B obj2 = new B("kumar");

        System.out.println(B.name);
        System.out.println(B.name);

        /*
        Both the output will be 'kumar' only, as the static variable is not dependent on the objects.
         */
        //        obj.greet();
    }


}
/*
static class Car{ //throws an error..

}

why outer class cannot be a static class ?
In the inner class it is dependent on the outer class. But in the outer class it is not dependent on the other class.
Because outer class is the top-most, and does not have any other class above it, so that's why it is a non-static class.

 */
