package Enum;

public class enum_mehtods {

//    enum can implement as many interface as the user wants
    enum Week implements A{
        sunday, monday;

        //we can create custom methods also....
        public  void fun(){
            System.out.println("I am function of enum..." + "of day " + this);
        }
        
        @Override
        public void greet() {
            System.out.println("Hi, Everyone.....");
        }
    }

    public static void main(String[] args) {
        Week w = Week.sunday;
        w.fun();
        w.greet();
    }
    
    
}
