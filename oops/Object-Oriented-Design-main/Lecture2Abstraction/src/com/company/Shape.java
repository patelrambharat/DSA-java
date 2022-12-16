package com.company;

public abstract class Shape {  // 1.//abstract class banaya hai isi liye abstract keyword ka use kiya hai
    String color;
    public Shape(){  //here constructor bna diya
                this.color ="red";
                System.out.println("inside shape constructor");
            }
    public  abstract int area(); // 2. //area ko abstract declare kr diya
}
    class  Square extends Shape{    //3.sqaure class bnayi aur area ko extends kr diya


    int side;
    public Square(){
        super(); //super ke dwara parent class ka constructure call kr skte hai
        System.out.println("inside square constuctor");
        side =4;
    }

    @Override
    public int area() {
        return side*side;
    }
}
