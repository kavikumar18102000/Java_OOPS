package Polymorphism.Types_of_Polymorphism.Run_time_or_Dynamic_polymorphism;

public class main {
    public static void main(String[] args) {
        shapes s1 = new shapes();
//        s1.area();

        circle c1 = new circle();
        c1.area();

        shapes s2 = new circle();
        s2.area();


//        How the area of the of circle is called ? It must call the parent class area according to the
//        concept of inheritance ?
        /*
        Ans :-
         */
        shapes s3 = new circle();
        s3.area();
    }
}
;