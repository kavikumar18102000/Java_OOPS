
what is multiple inheritance ?
    If a class has more than one parent, it is known as multiple inheritance.


NOTE : In java Multiple inheritance is not supported.

 Why it is not supported ?
 * Let us consider an example where, class C is inherited from class A and class B.
 * It means that both class A and B are the parents of class C.
 * lets assume that variable 'n' of type int is present in both the parent classes.
 * if we access that variable from the child class using the 'super' keyword, from which it is going to access
   will it access from the parent A or B ?
   This is where the problem may arise. So, java does not support multiple inheritance.

 What is the solution for Multiple inheritance or How to use Multiple inheritance in java?
    * To use multiple inheritance in java, java has a concept called "interfaces".
    * By using the 'interface' we can overcome the problem of multiple inheritance in java.
