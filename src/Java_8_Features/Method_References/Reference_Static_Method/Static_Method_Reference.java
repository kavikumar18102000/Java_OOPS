package Java_8_Features.Method_References.Reference_Static_Method;

//Method references can be done to a functional interface only...
interface Static_Method_Interface{
    void greet();
}

public class Static_Method_Reference {

    public static void main(String[] args) {
        Static_Method_Interface Static  = Static_Method_Reference::Welcome;
        Static.greet();

        Static_Method_Interface Result = Static_Method_Reference::result;
        Result.greet();
    }

    public static void Welcome(){
        System.out.println("Hi, Welcome to method references using a static method....");
    }

    public static void result(){
        System.out.println("I am a result...");
    }



}
