package Inheritance.Types_of_Inheritance.single_level_inheritance;

/*
A single level inheritance is nothing but only one child class is created for the parent class...
 */


public class Base_1 {
    int a;
    int b;

    public Base_1(int a,int b) {
        this.a = a;
        this.b=b;
    }

    public static void main(String[] args) {

        sub_class_1 s1 = new sub_class_1(10,20);
    }
}

class sub_class_1 extends Base_1{
    int c;
    int d;

    public sub_class_1(int c,int d) {
        super(c,d);
        this.c=c;
        this.d = d;
    }
}
