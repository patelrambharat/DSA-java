package oops.oops7;
class Bank{
    int getrateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getrateOfInterest(){
        return 8;
    }
}
class Hdfc extends Bank{
    int getrateOfInterest(){
        return 9;
    }
}
public class Mehodoverriding {
    public static void main(String[] args) {
    Bank bnk = new Bank();
    SBI s =new SBI();
    Hdfc h = new Hdfc();
    System.out.println("rate of interest for bank is "+ bnk.getrateOfInterest());
    System.out.println("rate of interest for sbi is " + s.getrateOfInterest());
    System.out.println("rate of interest for hdfc is "+ h.getrateOfInterest());
    }
    

}


// Can we override static method?
// No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

// Why can we not override static method?
// It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the 
// class area, and an instance belongs to the heap area.

// Can we override java main method?
// No, because the main is a static method.

// Difference between method overloading and method overriding in java
// There are many differences between method overloading and method overriding in java.
//  A list of differences between method overloading and method overriding are given below:

// No.	Method Overloading	Method Overriding
// 1)	Method overloading is used to increase the readability of the program.	Method overriding is used to provide the specific implementation of the method that is already provided by its super class.
// 2)	Method overloading is performed within class.	Method overriding occurs in two classes that have IS-A (inheritance) relationship.
// 3)	In case of method overloading, parameter must be different.	In case of method overriding, parameter must be same.
// 4)	Method overloading is the example of compile time polymorphism.	Method overriding is the example of run time polymorphism.
// 5)	In java, method overloading can't be performed by changing return type of the method only. Return type can be same or different in method overloading. But you must have to change the parameter.	Return type must be same or covariant in meth