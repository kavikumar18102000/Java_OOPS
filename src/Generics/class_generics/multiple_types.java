package Generics.class_generics;


import java.util.ArrayList;

//passing multiple type parameters..
public class multiple_types<T,S>{
    public T roll_no;
    public S name;

    public multiple_types(T roll_no, S name){
        this.name=name;
        this.roll_no=roll_no;
    }

    public static void main(String[] args) {
        multiple_types<Integer,String> s1 = new multiple_types<>(37,"Arya");

        System.out.println(s1.name+" "+s1.roll_no);


        //we can also perform this..
        ArrayList<multiple_types<Integer,String>> s2 = new ArrayList<>();

        s2.add(new multiple_types<>(56,"Loki"));
        System.out.println(s2.get(0).name+ " "+s2.get(0).roll_no);

    }
}
