package oops.oops3;
// class A{
//     int r= 10;     //this is not inheritance
//     void area(){
//         System.out.println("i am area");
//     }
// }
// class B{
//     void fun(){
//         A a = new A();
//         System.out.println(a.r);
//         a.area();
//     }
// }
// ****************************%%%%%***************
class Box{
    int length;
    int width;
    int height;
    Box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }
    Box(int length , int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    Box(int side){
        this.length = side;
        this.width = side;
        this.height = side;
    }
    Box(Box old){   //copy constructor
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }



}
 //super keyword refer to the object of the parent class 

class BoxWeight extends Box{   //we were able to achive inheritance using extends keyword
    //for now we can anything inside base class from child class
    //child extends patents
        int weight;
        BoxWeight(){
            weight =0;
        }
        BoxWeight(int weight,int length,int width, int height){
            super(length , width , height);
            this.weight = weight;
            super.length =-1;   //this is object of boxWeight
        }
}
public class inheritance {     //use extends ke
    public static void main(String[] args) {
        Box b1 = new Box(1, 2, 3);
        // BoxWeight b2 = new BoxWeight(10);
    
        System.out.println(b1.length+" "+b1.width +" "+ b1.height);
        // System.out.println(b2.weight);
        // b2.height = -1;
        System.out.println(b2.length +" "+ b2.width+" "+ b2.height);

    }
}
