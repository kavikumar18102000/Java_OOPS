package Lamda_functions.Level_2_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    String address;
    int age;
    SEX sex;



    public enum SEX {
        Male, Female
    }

    public Person() {
    }

    public Person(String name, String address,int age, SEX sex) {
        this.name = name;
        this.address = address;
        this.age=age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SEX getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                "age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void printPerson(){
        System.out.println(this.toString());
    }

    public static List<Person> getListOfPerson(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("kavi","banglore",23,SEX.Male));
        list.add(new Person("kumari","chennai",30,SEX.Female));
        return list;
    }
}
