package oops.oops1;
class Car{
    //properties
    String module = "automatic gear";
    String color = "blue";
    int price = 700000;
    //functionality
    void drive(){
        System.out.println("car is running");
    }
    void lock(){
        System.out.println("the car is locked");
    }
    void unlock(){
        System.out.println("the car is unlock");
    }
    void setPrice(int np){        //setter 
        price = np;
    }
    int getPrice(){                 //getter
            return price;
    }
}
public class Main {
    public static void main(String args[]){
            // Car c1 = new Car();   
            // //c1 -> reference variable or object , Car --> type of car class 
            // //new keyword assign memory to this reference variable ( this memory is assign in heap) 
            // // and reference variable assign in stack 
            // c1.color = "red";  //.operator is to access properties / functionality we use dot operator
            // c1.price = 500000;
            // c1.module= "automatic";
            // System.out.println(c1.color +" "+ c1.module +" "+ c1.price);

            // Car c2 = new Car();
            // c2.color = "black";  //.operator is to access properties / functionality we use dot operator
            // c2.price = 250000;
            // c2.module= "manual";
            // System.out.println(c2.color +" "+ c2.module +" "+ c2.price);   //give null because they are not sharing the value only sharing the schema
            // Car c3= new Car();
            // System.out.print(c3.color +" "+c3.module +" "+ c3.price);
            Car c4= new Car();
            c4.setPrice(20000);
            System.out.println(c4.getPrice());
            System
    }
}
