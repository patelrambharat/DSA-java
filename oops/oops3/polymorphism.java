package oops.oops3;



class Fruits{
    String color;
    void getsweetRation(){
        System.out.println("I give sweetness ration , ie sweetness/fruit name size");
    }
    int getsweetRation(int sweetness , int size){
        return sweetness/size;
    }
}
class Apple extends Fruits{
    String color;
    int sweetness=10;
    @Override  //just a annotation  we use this annotation to tell that this method is overriden method 
    void getsweetRation(){
       System.out.println("sweetness is ,"+sweetness/5);
    }

}
class banana extends Fruits{
    String color;
    int sweetness =20;
    void getsweetRation(){
        System.out.println("sweetness is ," + sweetness/6);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Apple a = new Apple();
        banana b= new banana();
        Fruits f= new Fruits();
        a.getsweetRation();
        b.getsweetRation();
        f.getsweetRation();
    }
}
