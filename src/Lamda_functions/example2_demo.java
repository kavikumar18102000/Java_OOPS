package Lamda_functions;

public class example2_demo {
    public static void main(String[] args) {
        function f1 = (x)-> System.out.println(2*x);
        f1.mul(5);

        collapse c1 = (x,y)->x+y; //here as default return is added to it...
        System.out.println(c1.add(3,4));
    }
}

interface collapse{
    int add(int x,int y);
}
interface function{
    void mul(int x);

    default void greet(){
        System.out.println("Hello World..");
    }
}
