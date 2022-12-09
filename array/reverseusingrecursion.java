import java.util.*;
public class reverseusingrecursion {
    public static void reverse(int arr[] , int start, int end){
            while (start>=end) {
                return;
            }
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start+1,end-1);

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0, n-1);
        for(int i=0;i<n;i++){

            System.out.print(arr[i] +" ");
        }
    }
}
