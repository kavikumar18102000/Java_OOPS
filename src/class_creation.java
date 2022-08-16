public class class_creation {
    public static void main(String[] args) {

        Student s1 = new Student(); // object calls default constructor....

        Student s2 = new Student(36,"kumar",99.9f); // calls constructor which takes these arguments as parameters..
//        s1.rno=37;
//        s1.name= "Arya";
//        s1.marks=77.8f;

//        System.out.println(s1.rno+ s1.name+ s1.marks);

        System.out.println(s2.name);

//        Referencing the initialized object with other referencing variable...
        Student s3 = s2; //s3 is referenced to object s3;
        System.out.println(s3.name);



//        Passing the object as a parameter to the constructor...
        Student s4 = new Student(s2); //it invokes the constructor which takes object as the arguments...
//        s4.name="kavi";  // we can also change the value of the variable....
        System.out.println(s4.name);


//        Use of new keyword....

        /*

        new keyword allocates the memory in the heap.
        primitive data types gets allocated in the stack.
        new keyword is only used to create an object.
        new keyword allocates the memory during the run time.
        objects are dynamically allocated...


         */



    }
}

class Student{
    int rno;
    String name;
    float marks;

//    Default constructor.....
    Student(){

//        this is how you call a constructor inside another constructor..
        this (13,"arya",99.85f);
    }

//    constructor overloading ........

    /*
    this keyword will replace with the name of the object internally.. or we can say that it is used to refer to that
     particular object.

     this keyword it also used to call the constructor inside another constructor..
     */
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

//    constructor taking the object as a parameter... This is also known as copy constructor..

    /*
    A copy constructor is a constructor which creates an object by using another object of the same class.
     */
    Student(Student object){
        this.name= object.name;
        this.rno= object.rno;
        this.marks= object.marks;
    }
}
