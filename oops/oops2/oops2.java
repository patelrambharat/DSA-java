package oops.oops2;
class Car{
    //data member  
    String moduleName = "Automatic";
    String color ="red";
    int price = 1300000;

    //constructor -->a cons has a special method which is same name as class 
    //whenever we created an object it called the constructor , means it automaticaly called itself 
    //at the time of object creation 
    Car(){             //constructor overriding 

        //default cons --> do'nt have any argument
        System.out.println("I am a constructor");
        moduleName = "Not specified";
        color ="Not specified";
        price = 0;
    }
    // Car(String givenModulename, String givencolor, int givenprice){
    //     //parameterised constructor --> where we already have argument
    //     System.out.println("this is a parameterised cons");
    //     moduleName = givenModulename;
    //     color = givencolor;
    //     price = givenprice;
    // }
    // Car(String givenmoduleName , String givencolor){
    //     System.out.println("this is a parameterised cons");
    //     moduleName = givenmoduleName;
    //     color = givencolor;
    //     price = 600000;
    // }

    //class method 
    void drive(){
        System.out.println("car is running");
        //now here I learn method overloading 

    }
    void drive(boolean isunlock){
        if(isunlock){
            System.out.println("can drive");
        }
        else{
            System.out.println("can'nt drive");
        }
    }
    void lock(){
        System.out.println("car is lock");
    }
    void unlock(){
        System.out.println("car is unlock");
    }
    void setPrice(int np){       //setter
        if(np < 0)
            return;
        price = np;
    }
    int getPrice(){              //getter
        return price;
    }
}
public class oops2 {
    public static void main(String args[]){
            // Car c1= new Car();
            //  // //c1 -> reference variable or object , Car --> type of car class 
            // // //new keyword assign memory to this reference variable ( this memory is assign in heap) 
            // // // and reference variable assign in stack 
            // c1.moduleName = "Automatic";   //.operator is to access properties / functionality we use dot operator
            // c1.color = "red";
            // c1.price = 1400000;
            // System.out.println(c1.moduleName +" "+ c1.color+" "+ c1.price);     //give null because they are not sharing the value only sharing the schema

            // Car c2 = new Car();
            // System.out.println(c2.moduleName +" "+ c2.color+" "+ c2.price);
            
            // Car c3 = new Car();
            // c3.setPrice(20000);           ///to remove this we can use getter and setter -ve price type
            // c3.getPrice();   //updating the data member
            // System.out.println(c3.moduleName +" "+ c3.color+" "+ c3.price);
            // Car c4 = new Car();
            // System.out.println(c4.price); 
            // Car c5 = new Car("Automatic ", "red", 10000);
            // System.out.println(c5.price);
            // // System.out.println(c4.price);
            // Car c6 = new Car("manual", "green");
            // System.out.println(c6.moduleName +" "+ c6.color +" "+c6.price);
            Car c7  = new Car();
            c7.drive();
            c7.drive(false);

            
            
    }
}
