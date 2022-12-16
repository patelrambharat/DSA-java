package com.company;

public class Main {
    public static void main(String[] args) {
        Human obj=new Human();
//        obj.age   yha error aa jayega
        obj.age=0;
        obj.weight=10;

    }
}

//ek class ke andr keval ek hi public class rhega agr multiple
//create kiya to compile time errror aa jayega
//private ka case
//class Human{
////    private int age;  //private krne se jis class me create kiya hai whi access kr payenge
//    //khi aur jayenge to wo error de dega
//
//    int age; //default ka case with in the same package
//
//}

