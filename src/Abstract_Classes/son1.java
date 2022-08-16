package Abstract_Classes;

public class son1 extends Parent{
    public son1(int age) {
        super(age);
        this.age = age; //even this is also pointing to the abstract class variable, as this extends the base class.
    }

    @Override
    void career() {
        System.out.println("I am gonna be a coder....");
    }

    void name(){
        System.out.println("I am Arya");
    }

    //we can override a normal method of an abstract class

    @Override
    public void normal_method() {
        super.normal_method();
    }


}
