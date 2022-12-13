package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class compositeNumber {
    static boolean isPrime(int num){
            boolean isprime = true;
            for(int i=2;i * i < num;i++){
                if(num%i ==0){
                    isprime = false;
                    break;
                }
            }
            return isprime;
    }
    static void removePrimes(int arr[], int len ){
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<len;i++){
            int number = arr[i];
            if(isPrime(number) == false){
                    //composite
                    
            }
            else{
                //prime or 1
                ans.add(number);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        removePrimes(arr, n);
    }
    
}
