import java.util.*;
public class subarraysum {
    public static int subarra(int arr[] , int n){
        int maxsofar = Integer.MIN_VALUE;
        int maxiending= 0;
        for(int i=0;i<n;i++){
            maxiending += arr[i];
            maxsofar = Math.max(maxsofar, maxiending);
            if(maxiending<0)
                maxiending =0;
            
        }
        return maxsofar;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]  = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(subarra(arr, n));
}
}
