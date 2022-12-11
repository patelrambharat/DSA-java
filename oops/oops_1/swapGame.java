package oops.oops_1;
class Person{
    int age;
    String name;
    Person(){
        age= 0;
        name = "";

    }
    Person(int age, String name){
        this.age = age;
        this . name = name;
    }
    void print(){
        System.out.println("Name" +this.name +"Age"+this.age);
    }
}
    
        
    
public class swapGame {
    // static void swap(Person tp1, Person tp2){
    //     Person temp = tp1;
    //     tp1= tp2;
    //     tp2= temp;
    // }
    static void swap(Person tp1, Person tp2){
        String tempName = tp1.name;
        tp1.name = tp2.name;
        tp2.name = tempName;

        int tempAge= tp1.age;
        tp1.age = tp2.age;
        tp2.age = tempAge;
    }
    public static void main(String args[]){
        Person p1 = new Person(21, "Bharat");
        Person p2 = new Person(22, "aditya");
        swap(p1, p2);
        System.out.println("swaping done");
        p1.print();
        p2.print();

    }
}
    