package Static_Block;

public class Static_Block {
    static int a=5;
    static int b;

    /*
    why we use static block ?
    Ans :- The static block is a block of statement inside a Java class that will be executed when a class is first
    loaded into the JVM. A static blocks helps to initialize the static data members, just like constructors help to
    initialize instance members.

    this block will run only once when the first object of that class is created...
    static block will get initialized when the class loads...
     */

    static{
        System.out.println("HI, I am a static block...");
        b=a*5;
    }

// we can use multiple static blocks also....
    static{
        System.out.println("Hi, I am second static block");
    }

    public static void main(String[] args) {
        Static_Block obj = new Static_Block();
        System.out.println(Static_Block.a+" "+Static_Block.b);

        Static_Block.b+=5;

        Static_Block obj2 = new Static_Block();
        System.out.println(Static_Block.a+" "+obj2.b);
    }
}
