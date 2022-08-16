package Generics.Interface_generic;

import java.security.spec.RSAOtherPrimeInfo;

public class Main implements student<Integer>{
    @Override
    public void rollno(Integer num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.rollno(37);
    }

}
