package Polymorphism.Types_of_Polymorphism.compile_time_or_static_polymorphism;

public class main {
    public static void main(String[] args) {
        compile_time_or_static c1 = new compile_time_or_static();

        c1.add(10,20);

        c1.add(12,25); //here the method takes the first argument of type double, but we are passing of int
        // . Here java automatically type casts it into double. But the second argument cannot be converted
        // into double as the type itself is declared as int.
    }
}
