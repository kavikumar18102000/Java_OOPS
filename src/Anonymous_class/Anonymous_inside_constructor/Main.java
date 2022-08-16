package Anonymous_class.Anonymous_inside_constructor;

public class Main {

//    This is also known as Anonymous class that defines inside the constructor or method...
public static void main(String[] args) {
    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("I am a runnable thread inside an constructor");
        }
    });

    t.start();
    System.out.println("I am an main class......");
}
}
