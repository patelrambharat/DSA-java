package com.company;

public class Main {
    public static void main(String[] args) {
        
        Human obj = new Human();
        {
            obj.age=10;
            System.out.println("bhaiya wapas aa gya");
            Male alpha = new Male();
            {
                alpha.sleep();   //Human ka function bhi call ho rha hai
            }
        }
        Scorpio fav = new Scorpio();
        fav.intro();
    }
}

class Male extends Human{   //Human wali property male class extends kr rhi hai


}
class  Human{
    int age;
    int weight;

    void sleep(){
        System.out.println("bhaiya is sleeping");
    }
    void eat(){
        System.out.println("bhaiya is eating");
    }
}

class  Scorpio extends  Mahindra{

}
class  Mahindra extends Car {
    int rating;
    void intro(){
        System.out.println("This is the Mahindra");
    }
}
class Car{
    //property
    String color;
    int weight;
    void  run(){
        System.out.println("car is running");
    }
    void breakCar(){
        System.out.println("Car is breaking");
    }
}