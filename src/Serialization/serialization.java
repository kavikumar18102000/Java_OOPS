package Serialization;

import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;

/*

Serialization in Java is a mechanism that allows objects to be converted into a stream of
bytes, which can then be saved to a file or transmitted over a network. The reverse process,
where the stream of bytes is used to recreate the object, is called deserialization.

Java provides built-in support for serialization through the java.io.Serializable interface.
To make a class serializable, you simply need to implement this interface. The Serializable interface acts as a
marker interface, meaning it doesn't define any methods but serves as a flag to the Java runtime that the class can be serialized.


*/
class person implements Serializable {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class serialization {
    public static void main(String[] args) {
        person p = new person("arya",20);

        try(FileOutputStream fileout = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout)) {

            out.writeObject(p);
            System.out.println("Serilizable data is stored in file person.ser");

        }
        catch (Exception e){
            e.printStackTrace();
        }


        /*
        In the above code, we create an instance of Person with some data. We then create a FileOutputStream and
        wrap it in an ObjectOutputStream. Finally, we call the writeObject() method to serialize the Person object
        and save it to a file called "person.ser". If an exception occurs during serialization, it will be caught and printed.

        */

//-------------------------------------------------------------------------------------------------------------------

        /*
        To deserialize the object and recreate the Person instance, you can use the ObjectInputStream
        */

        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            person person = (person) in.readObject();
            System.out.println("Deserialized data:");
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        In the above code, we create a FileInputStream and wrap it in an ObjectInputStream. Then, we call the
        readObject()method to deserialize the object from the "person.ser" file. We cast the result to a Person object
        and print it.

        It's important to note that not all objects can be serialized. Certain types of objects, such as those with
        non-serializable fields or objects with transient fields, may cause serialization exceptions. Also, keep
        in mind that serialized objects should be backward-compatible with the classes used during serialization and
        deserialization. If the class structure changes, deserialization may fail.
        */


    }
}
