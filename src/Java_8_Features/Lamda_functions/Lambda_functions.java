package Java_8_Features.Lamda_functions;


//a lambda function is a function which is implemented in a single line...
/*
Lambda expressions are added in Java 8 and provide below functionalities.
    * Enable to treat functionality as a method argument, or code as data.
    * A function that can be created without belonging to any class.
    * A lambda expression can be passed around as if it was an object and executed on demand.
 */

/*
Important points:

* The body of a lambda expression can contain zero, one or more statements.
* When there is a single statement curly brackets are not mandatory and the return type of the anonymous function is
  the same as that of the body expression.
* When there are more than one statement, then these must be enclosed in curly brackets (a code block) and the return
  type of the anonymous function is the same as the type of the value returned within the code block, or void if
  nothing is returned.
 */


/*
NOTE : Lambda expression is used only if the method has a single statement in it, otherwise it can't be used...
 */

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Lambda_functions {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        /*
        for(Object item : list){
            System.out.println(item);
        }
        --> we are writing the above function in a single lin as follows below...
         */
//        list.forEach((item)-> System.out.println(item));


        //we are implementing the interface methods here using lambda functions..
        Operation sum = (a,b)-> a+b; //we can directly instantiate the lambda expression...
        /*
           the method is like this...
           int operate(int a,int b){
                return a+b;
                }
        */
        Operation prod = (a,b)->a*b;
        Operation sub = (a,b)->a-b;


        Lambda_functions l1 = new Lambda_functions();
        System.out.println(l1.perform(20,10,sum)); //we are passing the implemented func as a parameter...
        System.out.println(l1.perform(20,10,sub));
        System.out.println(l1.perform(2,5,prod));




    }

    public int perform(int a, int b,Operation op){

        return op.operate(a,b);
    }
}


//lambda expression is applicable only for the interface with a single abstract method...
interface Operation{
    int operate(int a, int b);
//    int subtract(int a,int b); // we cant perform lambda operation if the interface contains same methods...
}


