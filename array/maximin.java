import java.util.*;
public class maximin {
    public static void maximin(int arr[] , int n){
        int maxi = arr[0];
        int mini = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > maxi){
                maxi  = arr[i];
            }
            if(arr[i]< mini){
                mini = arr[i];
            }
        }
        System.out.println(maxi+" "+mini);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        maximin(arr, n);
    }
}
