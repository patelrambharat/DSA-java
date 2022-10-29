package array;

import java.util.Scanner;

public class ncrprogram {
    public static int factorial(int n){
            int res= 1;
            for(int i=1;i<=n;i++){
                res *= i;
            }
            return res;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        int nfact= factorial(n);
        int rfact= factorial(r);
        int nmfact= factorial(n-r);
        int ncr= (nfact / (rfact * nmfact));
        System.out.println(ncr);
    }
}
