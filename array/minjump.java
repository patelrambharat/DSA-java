import java.util.*;

public class minjump {
    public static int minij(int arr[] , int start , int end){
        if(start >= end)
            return 0;
        int minjumpcount = Integer.MIN_VALUE;
        for(int i=1;i<= arr[start] && i<end;i++){
            int jmpcnt = 1+ minij(arr, start +i, end);
            if(jmpcnt < minjumpcount )
                minjumpcount = jmpcnt;
        }
        return minjumpcount;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]  = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minij(arr, 0, n-1));
    }    
}
