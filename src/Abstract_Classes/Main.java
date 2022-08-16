package Abstract_Classes;

public class Main {
    public static void main(String[] args) {
        son1 s1 = new son1(23);
        s1.name();
        s1.career();
        s1.normal_method();

        System.out.println();

        son2 s2 = new son2(27);
        s2.career();
        s2.name();

//        Parent p1 = new Parent(48); --> An abstract class cannot be instantiated..

        Parent.greet();// we can access a static method of an abstract class as it is independent of the object.

//        As the abstract class cannot be instantiated, but it can be referenced as follows.
        Parent s7 = new son1(21); // yah! acceptable...

    }
}
