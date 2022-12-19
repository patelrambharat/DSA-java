package oops.oops9;
class Car{
    private String brand;
    private int price;
     public String getBrand(){
        return brand;
     }
     public void setBrand(){
        this.brand =  brand;
     }
}
public class encapsulation {
   public static void main(String[] args) {
    Car cr =new Car();
    cr.getBrand();

    cr.setBrand();
   }
    
}
// Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

// encapsulation in java
// We can create a fully encapsulated class in Java by making all the data members of the class private. 
// Now we can use setter and getter methods to set and get the data in it.

// Advantage of Encapsulation in Java
// By providing only a setter or getter method, you can make the class read-only or write-only. 
// In other words, you can skip the getter or setter methods.
// It is a way to achieve data hiding in Java because other class
//  will not be able to access the data through the private data members.