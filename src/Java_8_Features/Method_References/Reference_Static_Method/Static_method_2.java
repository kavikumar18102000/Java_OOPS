package Java_8_Features.Method_References.Reference_Static_Method;

//static method references using inbuilt interfaces...

public class Static_method_2 {
    public static void threadRun(){
        System.out.println("Threading using method references...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(Static_method_2::threadRun);
        t1.start();
    }
}
