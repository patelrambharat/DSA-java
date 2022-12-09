import java.util.*;
public class sort012 {
    public static void sort(int arr[] , int n){
        int start=0;
        int end = n-1;
        int mid = 0;
        while(mid <= end){
            if(arr[mid]==0){
                    int temp = arr[mid];
                    arr[mid] = arr[start];
                    arr[start] = temp;
                    start++;
                    mid++;
            }
            else if(arr[mid]==1){
                    mid++;
            }
            else{
                    int temp = arr[mid];
                    arr[mid] = arr[end];
                    arr[end] = temp;
                    end--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        sort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}
