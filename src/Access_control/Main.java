package Access_control;

public class Main {
    public static void main(String[] args) {
        A a1 = new A(10,"Arya",1765,'b');

//        a1.name; --> we cant access this, as the name is declared as private....It is accessible only inside that
//        class
        char ch = a1.ch;

        /*
        How to access the private data member or member function ?
        Ans:- we can't access the private directly, but we can access it indirectly by creating a function to access
        the data member or member function inside that class.

        For ex: we can define the getter() and setter() function inside that class to access the private data member
        and member function.

        How a function declared inside that class can access the private ?
        Ans:- As we know that the private is accessible only inside that class, the function is also  declared inside
         that function only, as the function also becomes the member of that class...
         */
        String s = a1.getName();// accessing the private data member indirectly inside that class using the getter().
        System.out.println(s);
    }
}
