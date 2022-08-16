package Generics;

import java.util.Arrays;

//extends means that this class can have a type of number class only like Integer, Float , Long etc...
//A generic cannot be instantiated directly...
//T represents the type it takes as parameter. It can be Integer, float that is a class of number as it inherits the
// Number class.

//we can also create an interface of generic type like "public interface student<T>{}"...

public class custom_generics_arraylist<T extends Number> {
    private Object data[];
    private int size=0;
    public static int DEFAULT_SIZE = 10;
    private int num;

    public custom_generics_arraylist(){
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T value){
        if(isfull()){
            resize();
        }
        data[size++] = value;
//        size++;
    }


    public boolean isfull(){
        if(size == data.length){
            return true;
        }
        return false;
    }
    public void resize(){
       Object[] temp = new Object[DEFAULT_SIZE*2];

       for(int i=0;i<data.length;i++){
           temp[i]=data[i];
       }
        data = temp;
    }

    @Override
    public String toString() {
        return "custom_generics_arraylist{"+
                "data="+ Arrays.toString(data) +
                ", size="+ size +
                '}';
    }

    public static void main(String[] args) {
        custom_generics_arraylist<Integer> list = new custom_generics_arraylist<>();

//        custom_generics_arraylist<String> list2 = new custom_generics_arraylist<String>(); --> its not allowed as
//        the type is specified as Number classes not String...

        for(int i=1;i<14;i++){
            list.add(i*2);
        }

//        for(Object i : list.data){
//            System.out.println(i);
//        }
        System.out.println(list.toString());
    }
}
