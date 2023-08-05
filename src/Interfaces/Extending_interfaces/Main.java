package Interfaces.Extending_interfaces;



/*
Yah! we can extend an interface with other interface.

we can also precisely tell that inheritance is also achieved in interface also...
 */
public class Main{
    public static void main(String[] args) {
        using u1 = new using();
        u1.morning();
        u1.greet();

        u1.fun(); //it calls the method in interface B not A. As the class implements B directly priority is given to
        // that not A.
    }


}
