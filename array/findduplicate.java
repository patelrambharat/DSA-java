import java.util.*;
public class findduplicate {
    public static int duplicate(int arr[] , int n){
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(duplicate(arr, n));
    }
}
