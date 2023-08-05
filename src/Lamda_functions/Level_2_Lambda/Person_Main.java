package Lamda_functions.Level_2_Lambda;

import java.util.List;
import java.util.function.Predicate;

public class Person_Main {

    @FunctionalInterface
    interface Checkperson{
        boolean test(Person p);

    }

    static class CheckPersonEligibleForSelectiveSearch implements Checkperson{
        @Override
        public boolean test(Person p) {
            return p.sex == Person.SEX.Female &&
                    p.getAge()>=23 &&
                    p.getAge()<=30;
        }
    }

    public static void printPerson(List<Person> people, Checkperson tester){
        for(Person p:people){
            if(tester.test(p)){
                p.printPerson();
            }

        }
    }

    public static void printPersonPredicate(List<Person> people, Predicate<Person> tester){
        for (Person p:
             people) {
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }

    public static void ageOlderThan(List<Person> people, int age){
        for (Person p:
             people) {
            if(p.getAge()>age){
                p.printPerson();
            }
        }
    }

    public static void ageWithInRange(List<Person> people, int low,int high){
        for (Person p:
             people) {
            if(p.getAge()>=20 && p.getAge()<=high){
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> people = Person.getListOfPerson();
//        System.out.println(people);
        ageOlderThan(people,23);
        ageWithInRange(people,20,30);

//        printPerson(people, new CheckPersonEligibleForSelectiveSearch());


        //same logic using anonymous class
        /*
        printPerson(people, new Checkperson() {
            @Override
            public boolean test(Person p) {
                return  p.sex == Person.SEX.Female &&
                        p.getAge()>=23 &&
                        p.getAge()<=30;
            }
        });
         */

        //same function as a lambda
        printPerson(people, (Person p) ->
                        p.sex == Person.SEX.Female &&
                        p.getAge()>=23 &&
                        p.getAge()<=30);

        //same function using predicate
        printPersonPredicate(people, p ->
             p.sex == Person.SEX.Female &&
                        p.getAge() >23 &&
                        p.getAge()<=30);

    }
}
