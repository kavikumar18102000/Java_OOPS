package Exception_handling;

/*
What is an exception ?
An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
When an error occurs within a method, the method creates an object and hands it off to the runtime system.
 */

/*
Diff between throw and throws ?
--> The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used
    to explicitly throw an exception within a method or block of code. The throws keyword is used in a method signature
    and declares which exceptions can be thrown from a method.

    And also throws keyword specifies the user what type of exception may occur if they implement those methods...
 */
public class exception {


    public static void main(String[] args) {
        int a=5;
        int b=0;

        //try block tries to do the task given in the block
        try{
            System.out.println(a/b);

            throw new Exception("just for fun");//this not allow other catch block rather than the block contains
            // Exception class in it...
        }
        //catch block catches the exception occurred while executing the try block...
        catch (Exception e){ //here e is an object of class exception...
            System.out.println(e.getMessage());
        }
//        catch (Exception d){ --> we can't use multiple catch block with the same class name, as the first catch
//                  itself caught the error,there will be a complilation error. But we can use multiple catch block with
//                  different class name.

//            System.out.println(d.getMessage());
//        }

//        catch (ArithmeticException l){--> this will also not work if it contains diff class name. Why ? because the
//        Exception class is used first, which has all the class in it. So it will not allow the below catch block to
//        work. If we other class to catch exception, we should use them above the exception class.

//            System.out.println(l.getMessage());
//        }


        //using finally block..
        try{
            int g=divide(a,b);
        }
        catch(ArithmeticException d){
            System.out.println(d.getMessage());
        }
        finally {// weather the try block run or not, final block will always run even if there is an exception...
            //there can be only one finally block not multiple...
            System.out.println("this will always execute..");
        }
    }

    //explicitly if you want to a throw a custom error...
    static int divide(int a, int b) throws ArithmeticException{ //whenever it throws an explicitly we should specify
        // the exception next to the func name by using the 'throws' keyword followed by the class name of the
        // exception.
        if(b==0){
            throw new ArithmeticException("please don't divide by zero");//we can also pass the message value it
            // should print..
        }
        return a/b;
    }
}
