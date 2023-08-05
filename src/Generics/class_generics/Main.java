package Generics.class_generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //collection frameworks will only take objects as a value...
        ArrayList<student> list = new ArrayList<>();

        list.add(new student(37,"Arya"));
        list.add(new student(45,"kumar"));

        for(Object i : list){
            System.out.println(i.toString());
        }

    }
}
