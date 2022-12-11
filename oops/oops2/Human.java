package oops.oops2;
class HumanDe{
    String name;
    int age;
    boolean ismarried;
    String gender;
    static long population;
    HumanDe(){
        this.name ="unnamed";
        this.age= 0;
        this.ismarried = false;
        this.gender = "null";
        HumanDe.population =0;   //called using class name and dot operator
     }
    HumanDe(String name , int age, boolean ismarried , String gender){
            this.name = name;
            this.age= age;
            this.ismarried = ismarried;
            this.gender = gender;
            // this.population +=1;
            HumanDe.population +=1;     //by passing is not a good practice that's why call from class itself
    }
    //dependent on an object 
    void updateDetails(String name, boolean ismarried){
            this.name = name;
            this.ismarried = ismarried;
            //can I call sayBi here --> yes
            sayBi();
    }
    public String toString(){
        return this.name+" "+ this.age +" " +this.ismarried+" "+ this.gender+" "+this.population;
    }
    void sayBi(){    //dependent
        System.out.println("Bye everyone!");
    }
    //create a static keyword
    //not dependent on an object 
    static void SayHello(){     //independent 
        System.out.println("hello everyone!");
        // sayBi(); --> we can not call here because we need a object to call this 
        //but this one is without object 
        //a static method can'nt use on a non static method as well as member 
        // System.out.println(this); 
        // we can not call this because static member does'nt have any reference object
        


    }
}
public class Human {
    public static void main(String[] args) {
        // HumanDe bharat = new HumanDe("ritik" , 22, false, "male" );
        // System.out.println(bharat);
        // HumanDe rahul = new HumanDe("rahul" , 23, false, "male");
        // System.out.println("added a human");

        // //here population is not related to an object it is related to complete
        // //human class to make it related to complete class we make it static using static keyword
        // //static method or data members --> this are common to all objects of a class 
        // System.out.println(bharat);
        // System.out.println(rahul);
        // System.out.println(HumanDe.name); //we can;nt use like this physical significant only when object is created
        System.out.println(HumanDe.population);  //but this work because of static keyword
        HumanDe.SayHello();   //static member can be called without creating the object of the class
        //because they do'nt have the relation with object
        

        //member declared as static can be acceess before any of the object of the class is created an even 
        // without reference to a Object 
        //static metod or member belong to class not objects_________________%%%%%%%%

        //do
    }
}
