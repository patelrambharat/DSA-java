package oops.oops2;


public class WrapperClasses {
        //primitive data type --> int float long char boolean  total 8 type of primitive data type 
        //String is a class -- > identify by caps lock


        //wrapper class --> Integer, Float  , Long ,Character, Boolean this are known classes

        //we wanted to achive 100 % oops in java so that's why we use wrapper class
        //wanted to make java pure oops language
        //to achive this we intro the concept wrapper class
        //but we wanted everything as object
        public static void main(String args[]){
                //conversion of an premitive data type to a object of a clsss or --> wrapper class is known as wrapping
                //or it is also known as boxing 
               
                // Integer a= new Integer(10);
                // System.out.println(a);
                //  //conversion of a wrapper  classs to premitive data type is known an unwrapping or unboxing
                //  int  b = a.intValue();
                //  System.out.println(b);

                 //after java 5 we can do like
                  //conversion of an premitive data type to a object of a clsss or --> wrapper class is known as wrapping
                //or it is also known as Autoboxing 
                //  Integer c=10;
                //  System.out.println(c);
                //  //  //conversion of a wrapper  classs to premitive data type is known an unwrapping or Autounboxing
                //  int d= c;
                //  System.out.println(d);

                 //wrapper classes is slower than premitive data type 
                 //but some framework like hybernate , collection API does not allow premetive data type
                 //because they want to achive 100 % oops 
                 //thats why raper classed is introduce


                 //toString print address form of String
                 //toString --> print the value of that object--> this is known as method overriding 
                 //method ovverriding --:> toString()

        }

}
