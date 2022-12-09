package oops.oops_1;
class Car{
    //data member  
    String moduleName = "Automatic";
    String color ="red";
    int price = 1300000;
    //class method 
    void drive(){
        System.out.println("car is running");
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
public class oops1 {
    public static void main(String args[]){
            Car c1= new Car();
            c1.moduleName = "Automatic";
            c1.color = "red";
            c1.price = 1400000;
            System.out.println(c1.moduleName +" "+ c1.color+" "+ c1.price);

            Car c2 = new Car();
            System.out.println(c2.moduleName +" "+ c2.color+" "+ c2.price);
            
            Car c3 = new Car();
            c3.setPrice(20000);           ///to remove this we can use getter and setter -ve price type
            c3.getPrice();   //updating the data member
            System.out.println(c3.moduleName +" "+ c3.color+" "+ c3.price);
            
    }
}
