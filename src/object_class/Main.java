package object_class;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        object_class_demo obj1 = new object_class_demo(10,22.0f,"Arya");
        object_class_demo obj2 = new object_class_demo(10,23.13f,"Kavi");

        if(obj1 == obj2){
            System.out.println("Obj1 is equal to obj2");
        }

        //Another way of using equals
        if(obj1.equals(obj2)){
            System.out.println("Both the objects are equals..");
        }

        //using tostring();
        System.out.println(obj1.toString());

        //checking weather the object is instance or not.
        System.out.println(obj1 instanceof object_class_demo); //if yes returns true or else false.

        System.out.println(obj1 instanceof Object); //we know that every object is an instance of object class.

//        getclass() used to get the class of the instance.
        System.out.println(obj1.getClass());
    }




}
