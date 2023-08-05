package Enum;

//enum are group of variable or constants...
public class Main {
    enum Week{
        sunday, monday, tuesday, wednesday, thursday, friday, saturday

//        the enum variables are constants
//        enum are static , public and final
//        child of enums cannot be created
//        'Week' represents the enum type
//        enum cannot extend class...
//        enum can implement an interface...
//        enum does not allow abstract methods
    }

    /*
    Important Points of enum:

    * Every enum is internally implemented by using Class.

    // internally above enum Color is converted to
    class Week
    {
     public static final Week sunday = new Week();
     public static final Week monday = new Week();
     public static final Week Tuesday = new Week();
    }

    * Every enum constant represents an object of type enum.
    * enum type can be passed as an argument to switch statements.

     */

    public static void main(String[] args) {
        Week week;
        week = Week.sunday;

        System.out.println(week);

        for(Week day : Week.values()){
            System.out.println(day);
        }
    }
}
