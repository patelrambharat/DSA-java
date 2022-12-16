package com.company;

public class Main {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.runCar();

        Dog ani = new Dog();
        ani.speak();
    }
}
class  Car{
    int price;
    String color;
    int weight;

    void runCar(){
        System.out.println("car is running ");
    }
//    void runCar(){  //waise rkh diya tha then error aa rha tha
//        System.out.println("car is running ");
//    }
    void runCar(int speed){    //here parameter change kr diya
    System.out.println("car is running at speed 100 kms ");
}
    void runCar(float speed){   //data type change kr diya
        System.out.println("car is running ");
    }
    void runCar(int weight,int speed){   //parameter change krna hoga
        System.out.println("car is running ");
    }
}

class  Dog extends Animal{
    //bina inheritance ke nhi kr skte hai
    //override krne ke liye function ka nam same hona chahiye
    @Override //matlab ye dikha diya ki yaha override hua hai
    void speak(){    //yaha hmne animal ke speak wale method ko override kr diya hai
        System.out.println("mai to woof karega");
    }
}
class Animal{
    int age;
    int weight;
    void speak(){
        System.out.println("hi");
    }
}