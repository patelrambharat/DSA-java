package oops.oops6;

import javax.sql.rowset.spi.SyncResolver;

class Human{
    int age;
    int weight;
    void sleep(){
        System.out.println("human is sleeping");
    }
    void eat(){
        System.out.println("human is eating");
    }
}
class Male extends Human{
        int age = 35;
        void  agecal(){
            System.out.println("your age is " + age);
        }
}
class Female extends Human{

}
class Animal{  
    void eat(){System.out.println("eating...");}  
    }  
    class Dog extends Animal{  
    void bark(){System.out.println("barking...");}  
    }  
    class Cat extends Animal{  
    void meow(){System.out.println("meowing...");}  
    }  

public class inheritance {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.eat();
        Male bharat = new Male();
        bharat.sleep();
        bharat.agecal();
        Female shakshi = new Female();
        shakshi.eat();


        Animal ani =new Animal();
        ani.eat();
        Cat c =new Cat();
        c.eat();
        c.meow();
        Dog d =new Dog();
        d.eat();
        d.bark();
        
    }
    
}
