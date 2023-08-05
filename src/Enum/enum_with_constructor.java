package Enum;

public class enum_with_constructor {

    enum Week{
        sunday, monday, tuesday;

        //constructor is not public or protected, it is private or default.
        //constructor is called for each and every object seperately.
//        even if we access constructor for one instance, it will access for objects internally...
        /*

        Why it is private not public ?
        --> public allows us to call the constructor and create more objects, but that is not the use of enum
        as it should not be changed.

         */
        Week(){
            System.out.println("I am an constructor of enum....");
        }
    }

    public static void main(String[] args) {
        Week w = Week.sunday;
        System.out.println(w);
    }
}
