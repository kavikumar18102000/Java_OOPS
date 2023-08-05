package Anonymous_class.Annonymous_for_normal_class;

public class Main {

    //creating anonymous class for a normal class 'Thread'..

//    This is known anonymous inner class that extends a normal class...
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("I am thread class...");
            }
        };

        t1.start(); //use to start the thread...
        System.out.println("I am an main class...");
    }
}
