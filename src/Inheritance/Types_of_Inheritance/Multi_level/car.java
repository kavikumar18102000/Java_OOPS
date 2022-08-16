package Inheritance.Types_of_Inheritance.Multi_level;

/*
A multilevel inheritance is nothing but a child class is created for every parent class.

In the below code,

Car is  a parent class of its child class BMW, then BMW is the parent class of its child class Rolls_Royce.
 So this is how the multilevel inheritance works..

 But, here Rolls_Royce cannot access the Car class directly as it is not inherited directly, it should awake
 its parent class BMW, so the BMW can awake the Car class.

 So, the classes are inherited level by level. So, it is known as multilevel inheritance.

 */



public class car {
    String model_name;
    int car_no;

    public car(String model_name, int car_no) {
        this.model_name = model_name;
        this.car_no = car_no;
    }

    public static void main(String[] args) {
        Rolls_Royce r1 = new Rolls_Royce("Kabali",14563);
    }
}

class BMW extends car{
    String name;
    int number;

    public BMW(String name, int number) {
        super(name,number);
        this.name = name;
        this.number = number;
    }
}

class Rolls_Royce extends BMW{
    String name;
    int no;

    public Rolls_Royce(String name, int no) {
        super(name,no);
        this.name = name;
        this.no = no;
    }
}
