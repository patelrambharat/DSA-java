import java.util.*;
public class cyclicrotate {
    public static void cyclic(int arr[] , int n){
        int lastelem = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastelem;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        cyclic(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    
}
