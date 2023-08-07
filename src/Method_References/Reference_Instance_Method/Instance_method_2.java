package Method_References.Reference_Instance_Method;

public class Instance_method_2 {
    public void message(){
        System.out.println("Hi I am non-static method...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Instance_method_2()::message);
        t1.start();
    }
}
