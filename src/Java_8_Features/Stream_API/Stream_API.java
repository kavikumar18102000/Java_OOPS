package Java_8_Features.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
Stream can be used only once --> stream can be consumed only once.

* A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
* Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
* Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations
  can be pipelined. Terminal operations mark the end of the stream and return the result.


* The Stream API in Java is a powerful feature introduced in Java 8 that provides a functional programming style for
processing collections of data. It allows you to perform aggregate operations on collections, such as filtering,
mapping, reducing, and sorting, in a concise and declarative manner.

* The Stream API operates on streams, which are sequences of elements. A stream represents a pipeline of operations
that can be performed on a data source, such as a collection or an array. These operations can be divided into
intermediate operations and terminal operations.

* Intermediate operations are operations that transform a stream into another stream. Examples of intermediate
operations include filtering elements based on a condition, mapping elements to a different type, or sorting elements.

* Terminal operations are operations that produce a result or a side-effect, and they mark the end of the stream.
Examples of terminal operations include collecting the stream elements into a collection, finding the maximum or
minimum value, or performing a reduction operation.

* The Stream API promotes a functional programming paradigm by emphasizing immutability and the avoidance of side-effects.
It encourages writing code that is more concise, readable, and expressive.

"Overall, the Stream API provides a more elegant and functional approach to processing collections in Java, making
code more readable, expressive, and efficient."

 */


public class Stream_API {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,10,3,1,7,9);

        /*Stream<Integer> data = list.stream();
        Stream<Integer> mapdata=data.map(n->n*2);
        mapdata.forEach(n-> System.out.println(n));
        */

        //we can perform the operation like this alo..
//        list.stream().map(n->n*2).forEach(n-> System.out.println(n));

        //performing same operation on only odd numbers..
//        list.stream().filter(n->n%2==1).map(n->n*2).forEach(n-> System.out.println(n));


        //performing same operation by implementing predicate interface
        Predicate<Integer> predi = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                    return n%2==1;
            }
        };

        list.stream().filter(predi).map(n->n*2).forEach(n-> System.out.println(n));
    }
}
