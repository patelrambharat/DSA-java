import java.util.*;
public class moveallelementoneside {
    public static void moveall(int arr[] , int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                int temp = arr[j];
                arr[j] =arr[i];
                arr[i] = temp;
              
            }
            j++;
        }
    }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveall(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
