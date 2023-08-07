package Method_References.Reference_to_Constructor;


interface Constructor_reference{
    Message greet(String message); //make sure the return type of the function is as same as the class name of the
    // constructor.
}

class Message{
     Message(String message) {
        System.out.println(message);
    }

}

public class Reference_to_Constructor {
    public static void main(String[] args) {
        Constructor_reference basic = Message::new;
        basic.greet("Hi I am a Constructor of message class...");
    }

}

