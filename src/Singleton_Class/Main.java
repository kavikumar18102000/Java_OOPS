package Singleton_Class;

public class Main {
    public static void main(String[] args) {
        Singleton_class s1 = Singleton_class.getInstance();
        Singleton_class s2 = Singleton_class.getInstance();
        Singleton_class s3 = Singleton_class.getInstance();

//        All the three variable will point to the same object as singleton class allows to create a single object of
//        that class.
    }
}
