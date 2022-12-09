import java.util.*;
public class sort012bruteforce {
    public static void sort012(int arr[] , int n){
        Arrays.sort(arr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        sort012(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
