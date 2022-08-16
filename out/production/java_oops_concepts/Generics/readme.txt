

Generics are nothing but the parameterized types.

we can make a custom generics also.

Generics are only of type classes not a primitive data types like int , char ,float etc..

Why Generics?
--> The Object is the superclass of all other classes, and Object reference can refer to any object.
    These features lack type safety. Generics add that type of safety feature. We will discuss that type of safety feature
    in later examples.
    Generics in Java are similar to templates in C++. For example, classes like HashSet, ArrayList, HashMap, etc., use
    generics very well. There are some fundamental differences between the two approaches to generic types.

Type Parameters in Java Generics
The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:
* T – Type
* E – Element
* K – Key
* N – Number
* V – Value


Advantages of Generics:
Programs that use Generics has got many benefits over non-generic code.
1. Code Reuse: We can write a method/class/interface once and use it for any type we want.
2. Type Safety: Generics make errors to appear compile time than at run time (It’s always better to know problems in your
   code at compile time rather than making your code fail at run time). Suppose you want to create an ArrayList that store name of students, and if by mistake the programmer adds an integer object instead of a string, the compiler allows it. But, when we retrieve this data from ArrayList, it causes problems at runtime.