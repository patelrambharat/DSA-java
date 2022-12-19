package oops.oops7;

class Mahindra extends Car{

}
class Car{
    String color;
    int price;
    void runCar(){
        System.out.println("car is running");
    }
    void runCar(int speed){         //Method Overloading: changing data type of arguments
        System.out.println("car is running at speed 100");
    }
    void runCar(float speed){                    
        System.out.println("car is running 889.0");
    }
    void runCar(int speed, int weight){            //method overloading Method Overloading: changing no. of arguments
        System.out.println("car is runnnnning");
    }
}

class Adder{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class polymorphism {
   public static void main(String[] args) {
    Car hunda = new Car();
    hunda.runCar(20);
    hunda.runCar(20.6f);
    hunda.runCar();


    Mahindra obj = new Mahindra();
    obj.price=500;
    System.out.println("mahindra price is " + obj.price);

    Adder obj4 =new Adder();
    System.out.println(obj4.add(30,40));
    // System.out.println(obj4);
    System.out.println(obj4.add(30, 40, 40));


//     Can we overload java main() method?
// Yes, by method overloading. You can have any number of main methods in a class by method overloading.
//  But JVM calls main() method which receives string array as arguments only. Let's see the simple example:

// class TestOverloading4{  
// public static void main(String[] args){System.out.println("main with String[]");}  
// public static void main(String args){System.out.println("main with String");}  
// public static void main(){System.out.println("main without args");}  
// }  
    
   }
}
