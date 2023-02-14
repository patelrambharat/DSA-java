package oops.revisionoops.oops1;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student kunal;
//        kunal = new Student();

        Student patel = new Student(15, "Bharat", 85.4f);
        //create at compile time === create at runtime 
        //left side  == right side
        //new keyword --> dynammically allocate memory and return a reference to it 
        //means all class object in java must be allocate dynammically
        Student Bharat = new Student(18, "Bharat", 90.3f);

//        kunal.rno = 13;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 88.5f;

//instance variale means variable inside the object is known as instance variable like rno, name , marks
//dot operator is used to link reference variable into instance variable  like--> student1.rollno

    //    Bharat.changeName("Shoe lover");
    //       Bharat.greeting();

//
        System.out.println(Bharat.rno);
        System.out.println(Bharat.name);
        System.out.println(Bharat.marks);

        Student random = new Student(Bharat);
        System.out.println(random.name);

        Student random2 = new Student();          //constructor basicaly define what heppen when your object 
        //will be created 
        //constructor is a special function that runs when you create an object and it allocate some variables
        //by default it have no any argument
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}
//class is logical stugh 
// create a class  --> class is a template  like Car --> Maruti  , Fararri , Audi but engine is different means
//value is different , price is different  all this 
//object is instance of the class , instance means physical things, ocuuupy some space in memory ,is store in heap memory 
//reference is store in stack memory

//create a class 
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {         //consturctor
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {     //consturctor --> 
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}

//what is new keyword
//dynammically allocate memory and return a reference to it 