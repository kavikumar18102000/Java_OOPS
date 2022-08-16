
Rules for defining an Abstract class :

* An instance of an abstract class can not be created.
* Constructors are allowed.
* We can have an abstract class without any abstract method.
* There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simper terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
* We are not allowed to create objects for an abstract class.
* We can define static methods in an abstract class.But we can't make an abstract method static.
* We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
* If a class contains at least one abstract method then compulsory should declare a class as abstract
* If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method