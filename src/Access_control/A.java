package Access_control;

public class A {
    int a; //this is also known as default access specifier as no access specifier is specified. This can be access
    // only inside this package only not globally.

    private String name; // accessible only inside the class, not globally or not even in the same package. But we
    // can access it indirectly.

    public int reg; //this is accessed globally everywhere as it is public

    protected char ch; /* accessible inside this pkg, subclass of this pkg and diff pkf subclass not the diff pkg
    base class.

    If the protected should be accessed in different pkg, then the class should be the subclass in that pkg should
    extend this class to access it. But the base class in that class cannot access this.

    Why a base class in diff pkg cannot access protected ?
    Ans:- Even if we import  this class in diff pkg and create an instance of this class there, we can't access the
    protected members.

    This done so because , if a subclass extends this class there, the parent does know which child is inherited,  but
    the subclass knows all about the parent class. So, for this purpose only, subclass can only access the protected
    members.

    In simple words a parent class don't know what is extending it, but the subclass knows what it extends.

    If a protected is access by creating a instance of the base class in diff pkg, then there will no difference in
    public and protected..

    */

    public A(int a, String name, int reg, char ch) {
        this.a = a;
        this.name = name;
        this.reg = reg;
        this.ch = ch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
