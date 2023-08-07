package Method_References.Reference_Instance_Method;

interface Arithmetic{
    int result(int a, int b);
}

public class Instance_method {
    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Instance_method im = new Instance_method(); //creating the object of the class
        Arithmetic add = im::add; //referencing the object method to the interface
        System.out.println(add.result(10,20));

        Arithmetic sub = im::sub;
        System.out.println(sub.result(10,5));

    }
}
