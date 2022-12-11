package oops.oops_1;
class ComplexNumber{
    int real;
    int imaginary;
    ComplexNumber(){   //constructor
        real =4;
        imaginary =5;
    }
    ComplexNumber(int r, int i){    //parameteriaed cons
        real = r;
        imaginary = i;
    }
    //create a print method to print 
    void print(){
        System.out.println(this);
        System.out.println(real+" + " +imaginary +"i");
    }
        //write a addition function in the complex number
        ComplexNumber add(ComplexNumber cn){
                // System.out.println(real +" + "+ imaginary +"i");
                // System.out.println(cn.real +" + "+ cn.imaginary +"i");
                int addedRealpart = real + cn.real;
                int addimaginary  = imaginary + cn.imaginary;
                ComplexNumber addCN  = new ComplexNumber( addedRealpart,  addimaginary);
                {
                    return addCN;
                }


        }
        ComplexNumber subtract(ComplexNumber cn){
            int subtractrealpart = real - cn.real;
            int subtractimgpart = imaginary - cn.imaginary;
            ComplexNumber subcn = new ComplexNumber(subtractrealpart , subtractimgpart);
            {
                return subcn;
            }
        }
}
public class Exc1complexnumber {
    public static void main(String args[]){
            // ComplexNumber cn1= new ComplexNumber(5, 2);
            // cn1.print();
            // ComplexNumber cn2 = new ComplexNumber( 3, 4);
            // cn2.print();
            // // cn3 = cn1 + cn2
            // ComplexNumber cn3  = cn1.add(cn2);
            // cn3.print();

            // ComplexNumber cn4 = cn1.subtract(cn2);
            // cn4.print();

            // ComplexNumber cn5 = cn2.subtract(cn1);
            // cn5.print();

            ComplexNumber cn6 = new ComplexNumber(4, 5);
            cn6.print();
    }
}
