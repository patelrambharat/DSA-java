package com.company;

public class Main {

    public  static  void main(String []args){
        //write your code here

        //create an object

        //3.yha ek object create kiya jha se access kr skte hai
        //object is the instance of the class
        //object heap area pe memory leta hai

        Human chippi = new Human();
        //--> kyoki object creation pe constructor call hota hai
        //isko call krne ke bad ek constructor create hoga   line 28 pe
        System.out.println("wapas aa gya constructor se");
        chippi.age= 23;
        chippi.weight= 34;
        chippi.sleep();

        Human obj = new Human(12, 89);
        System.out.println("age is "+obj.age);

        System.out.println("number of object created "+Human.count);
        //static data member class se belong karta hai isliye yaha pe Human. kiya hai




    }
}

class  Human{   //pahle class create kiya   //class space nhi leta hai
    //properties
    int age;
    int weight;

    static int count =0;   //count number of object ko darsata hai

    //default constructor -> use for initialisation
    //types 1 no arguments 2.. parametersid constructor

    //parameresid constructor
    //constructor have no return type
    //constructor ko abstract /static /final /synchronized nhi kr skte

    public  Human(int age ,int weight){
        this(); //this use to hamesa current object ko dikhayega
        count++;
        this.age = age;
        this.weight= age;
    }

    //constructor overloading  -> same name ka ek aur constructor banke taiyar ise bolte hai
    //constructor overload kr diya
    //having same name but different parameter
    public  Human(float age){
        count++;
//        this.age = age;
        System.out.println("");

    }
    public  Human(){  //constructor name is same as class name
        count++;  //maine kaha jb bhi constructor call ho na to object wale cout ko bada dena count++
        age =0;
        System.out.println("inside the no orgs constructore creating object");
    }

    //behaviour
    void sleep(){    //  two function create kiya
        System.out.println("bhaiya is sleeping");
    }
    void eat(){
        System.out.println("bhaiya is eating");
    }
    //yaha static ki samajhenge
    static void update(){
//        this.age++;  //error aa rha hai kyoki ek static function me ek non static ko
        //access karne ki try kiya hai
        //but agr count ko update kiya hota to wo chl jata kyoki count static data member hai
        count++;
    }
}



////question
//1. static final /synchronise and abstract
//2. Constructor vs method ?
//        Constructor cannot be static , whereas method can be static
//3. Object Cloning
//        4. Do constructor return any value ?
//        5. If I didn't create any object, can be access static member of the class.: Yes
//        6. Why main method is static ?
//        7. Java does not support multiple inheritance
//        8. Diamond problem
//        9. Multiple inheritance
//        10. Difference between compile time and run time overloading ?
//        11. After changing return type during function does not work same as c ++
//        12. Can we overload main method in java ?
//        13. Can we override static method ?
//        14. Overriding vs Overloading ?
//        15. Assignment : Cohesion , Coupling , Association, Aggregation , Composition
//        15. What is annotation in java ? : e.g. @Override