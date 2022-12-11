package oops.oops2;

import java.util.Scanner;

class Student{
    // int rollNumber;
    // int age;
    // String name;
    // int attendence;
    // String gender;
    // Student(){
    //     this.rollNumber =0;
    //     this.age =0;
    //     this.name="uncknown";
    //     this.attendence =0;
    //     this.gender ="unknown";
    // }
    // Student(int rollNumber, int age, String name, int attendence, String gender){
    //     this.rollNumber = rollNumber;
    //     this.age = age;
    //     this.name = name;
    //     this .attendence = attendence;
    //     this .gender = gender;
    // }
    int rollNumber;
    String name;
    int attendence;
    Student(){
        this.rollNumber =0;   //this --> address of the current ref variable it refer to a class student
        this.name="uncknown";
        this.attendence =0;
    }
    Student (int rollNumber , String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }
    Student(int rollNumber, String name, int attendence){
        // this.rollNumber = rollNumber;
        // this.name = name;
        this(rollNumber, name);   //this () call the same class and the code is little bit smaller now
                                    //this () is used for constructor chaining 
        this.rollNumber = 99;    //never touch those parameter which are pass 
        this.attendence = 100;
        this .name = name;
    }
    //copy constructor
    Student(Student s){
        this.rollNumber = s.rollNumber;
        this.attendence =s.attendence;
        this.name = s.name;
    }
    Student setValue(){
        Scanner sc= new Scanner(System.in);
        System.out.println("name");
        this.name = sc.next();
        System.out.println("rollNumber");
        this.rollNumber = sc.nextInt();
        System.out.println("attendance");
        this.attendence = sc.nextInt();

        return this;      //we can return this also as return type 
    }
    void print(){
        System.out.println(this.name+" "+ this.rollNumber +" "+this.attendence);
    }
    //method  overloading --> method which have same name but different orgument
    //  increaseAttendance()
    // void func(int num){
    //         this.attendence +=1;
    // }
    // void func(String gender){
    //         this.gender = gender;
    // }
    // int func(String name, int rollNumber){
    //     return this.attendence;
    // }
}
public class Main {
        public static void main(String args[]){
            // Student s1 =new Student(22, 21, "bharat", 20, "Male");
            // Student s1 =new Student(30, "bharat", 20);
            // Student s2 = s1;
            // Student s1 =new Student(30, "bharat", 20);
            // Student s2 = new Student(s1);
            // s1.print();
            // s2.print();

            // // s1.func(22);
            // // s1.func("male");
            // // System.out.println(s1.func("bharat", 22));
            // s1.name = "adi";
            // s1.print();
            // s2.print();
            Student s1 =new Student();
            s1  = s1.setValue();
            s1.print();
        }
}
