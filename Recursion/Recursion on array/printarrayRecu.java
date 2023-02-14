import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr, n);
    }
    public static void PrintArray(int[] arr, int n) {
        // Write your code here
          //f(arr,0);
          if(n==0){
              return;
          }
          PrintArray(arr,n-1);
          System.out.print(arr[n-1] + " ");
      }
      /*public static void f(int []arr,int i)
      {
          // i........arr.length-1
          if(i==arr.length){
              return;
          }
          System.out.print(arr[i] + " ");
          f(arr,i+1);
      }*/
    }  