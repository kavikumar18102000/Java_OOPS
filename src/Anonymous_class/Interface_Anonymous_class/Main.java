package Anonymous_class.Interface_Anonymous_class;

import Anonymous_class.Interface_Anonymous_class.car;

public class Main {
    public static void main(String[] args) {

        //creating an anonymous class for an interface;
        car mycar = new car(){

            @Override
            public void name(String name) {
                System.out.println("Name of the car is :"+name);
            }

            @Override
            public void model_id(int id) {
                System.out.println("Model number is :"+id);
            }
        };

        mycar.name("BMW 800");
        mycar.model_id(234123);
    }
}
