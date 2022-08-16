package Generics.class_generics;

public class student {
    public int rollno;
    public String name;

    public student(int num, String name){
        this.name = name ;
        this.rollno = num;
    }

    public String toString(){
        return name;
    }
}
