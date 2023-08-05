package object_class;

/*

Class Object is the root of the class hierarchy. Every class has Object as a superclass. This is done internally.
 */

public class object_class_demo {

    int n;
    float f;

    String name;

    public object_class_demo(int n, float f,String name) {
        this.n = n;
        this.f = f;
        this.name = name;
    }

    /*
        It basically gives the number representation of the object.
         */
    @Override
    public int hashCode() {
        return super.hashCode();
    }



    /*
    used to check weather the two objects are equal...
     */
    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.n==((object_class_demo)obj).n; //here it will only check the n values are equal. (
        // (object_class_demo)obj) is type casted from the object type to type of this class 'object_class_demo'.
    }

    /*
    Creates and returns a copy of this object. The precise meaning of "copy" may depend on the class of the object
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    /*
    toString() is to print the name of the object.
     */
    @Override
    public String toString() {
//        return super.toString();
        return name;
    }


    /*
    finalize() is called by the garbage collector before destroying the objects to clean up the data.
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
