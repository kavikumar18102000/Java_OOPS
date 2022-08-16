
In Java, a class can contain another class known as nested class. It's possible to create a nested class without giving any name. A nested class that doesn't have any name
is known as an anonymous class. Anonymous classes usually extend subclasses or implement interfaces.

Nested Classes in Java is prerequisite required before adhering forward to grasp about anonymous Inner class. It is an inner class without a name and for which only a single
object is created. An anonymous inner class can be useful when making an instance of an object with certain “extras” such as overriding methods of a class or interface, without
having to actually subclass a class.

Syntax:- for defining an anonymous class.

// Test can be interface,abstract/concrete class
Test t = new Test()
{
   // data members and methods
   public void test_method()
   {
      ........
      ........
    }
};


Now let us do discuss the difference between regular class(normal classes) and Anonymous Inner class

    * A normal class can implement any number of interfaces but the anonymous inner class can implement only one interface at a time.
    * A regular class can extend a class and implement any number of interfaces simultaneously. But anonymous Inner class can extend a class or can implement an interface but not both
      at a time.
    * For regular/normal class, we can write any number of constructors but we can’t write any constructor for anonymous Inner class because the anonymous class does not have any name
      and while defining constructor class name and constructor name must be same.


Note: We can declare the following in anonymous classes as follows:
        * Fields
        * Extra methods (even if they do not implement any methods of the supertype)
        * Instance initializers
        * Local classes


Based on declaration and behavior, there are 3 types of anonymous Inner classes:
        * Anonymous Inner class that extends a class
        * Anonymous Inner class that implements an interface
        * Anonymous Inner class that defines inside method/constructor argument
