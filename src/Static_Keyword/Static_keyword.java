package Static_Keyword;

class Human{
    int age;
    String name;

    /*
    The static variable is not related or dependent on the objects or the instances.
    We can access the static variable without creating the object for that class.
    To access the static variable, we use the class name itself but not the 'this' keyword. We can use this
    keyword also.

    static variables are nothing but the common property in the entire class.
    Means in the above class 'Human' population is common for all the human, if the population is like 1.2billion it
    will be same for all the humans.
     */
    static int population;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        Human.population+=1; //as an instance/object is created for human the population increases every time, so we
        // are increasing the population everytime we create an object..
    }
}


public class Static_keyword {

    /*

    Why main function is static in java?
    We know that the code execution starts from the main function. So if it is not static how will the code gets
    executed. As we know that the static is not dependent on the object, so that the main function gets executed
    without creating an instance.

    Two conditions for functions in java :
    * One is that the method should be static to call without creating an instance.
    * otherwise the instance of that class should be created to access the method

     */

    public static void main(String[] args) {

        Human arya = new Human(21,"Arya");
        System.out.println(Human.population);

       // greetings(); //If a method is non-static then an instance of the class should be created to call the
        // non-static
        // method.
    }

    static void message(){
        System.out.println("Hello world...");
    }

    void greetings(){
        message(); //we can access the static function in a non-static function also..

        System.out.println("Hi Every body....");
    }
}
