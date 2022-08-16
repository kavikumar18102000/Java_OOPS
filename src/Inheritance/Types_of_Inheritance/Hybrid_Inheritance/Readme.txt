
What is Hybrid Inheritance ?
    * Hybrid inheritance is a combination of both multiple and multilevel inheritance.
    * A class is derived from two classes as a multiple inheritance, however one of the parent class is not
      a base class, and it is derived class.

    Example :
         Lets consider class A as a base class, and it is the parent class for both class B and C(concept of
         multiple inheritance), and class D derived from class B and class C and not from A. It has different
         level of inheritance, so it is also known as multilevel inheritance.

  NOTE : In java Hybrid inheritance is not supported.

  Why not supported in java ?
    same problem as in the multiple inheritance.

  How to use hybrid inheritance in java?
    using the concept of "interfaces", we can overcome this problem in java.