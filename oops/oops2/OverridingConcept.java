package oops.oops2;
class Accio{
    int rollNumber;
    String name;
    Accio(String name, int rollNumber){
            this.name = name;
            this.rollNumber = rollNumber;
    }
    Accio(){
            this.name ="";
            this.rollNumber =0;
    }
    //overriding toString method
    public String toString(){
        return "hello";
    }
}
public class OverridingConcept {
    public static void main(String[] args) {
        Accio obj = new Accio("bharat" , 21);
        System.out.println(obj);
    }
}
