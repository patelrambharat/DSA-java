package oops.oops5;
class Human{
    //constructor 2 types 
    //1.default constructor
    Human(){
            age =0;
            System.out.println("i am the default constructor");
    }
    //2.parameterised constructor
    public Human(int age, int weight){
        this.age =age;
        this.weight = weight;
    }
    //constructor overloading 
    public Human(int a){
        System.out.println(" ");
    }

    //inheritance 
    
    //data member
    int age;
    int weight;
    //behaviour
    
    void sleep(){
        System.out.println("bhaiya is sleeping 123");
    }
    void eat(){
        System.out.println("bhaiya is eating");
    }
}
//inheritance
class Male extends Human{

}
class Scorpio extends Mahindra{
    String color;
}
class Mahindra extends Car{
    int rating;
    void intro(){
        System.out.println("this is mahindra");
    }
}
//inheritance core example 
class Car{
    String color;
    int price;
    void runCar(){
        System.out.println("car is running");
    }
    int runCar(int a, int b){
        System.out.println("car is walk");
        return 0;
    }   
    void runCar(int speed){
        System.out.println("car is running at speed"+speed);
    }
    void breakCar(){
        System.out.println("car is breaking");
    }
}
//
public class oops5 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.age = 25;
        obj.weight = 27;
        obj.eat();
        obj.sleep();
        Human shakshi = new Human(25, 60);
        System.out.println("shakshi age is " + shakshi.age +" shakshi weight is " + shakshi.weight);

        Male obj3 = new Male();        //ye  inheritance ki wajah se call hua hai
        obj3.age = 34;
        System.out.println(obj3.age);


        Mahindra fav= new Mahindra();
        fav.intro();
        fav.breakCar();
        fav.runCar();
    }
}
