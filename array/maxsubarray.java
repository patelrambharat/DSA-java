import java.util.*;

public class maxsubarray {
    public static int maxsub(int arr[] , int  n , int k){
        Arrays.sort(arr);
        int mini= arr[0];
        int maxi = arr[n-1];
        int ans = maxi - mini;
        for(int i=0;i<n;i++){
            mini = Math.min(arr[0]+k , arr[i] -k);
            if(mini <0)
                continue;
            maxi = Math.max(arr[n-1]-k , arr[i-1]+k);
            ans = Math.min((maxi - mini), ans);
        }
        return ans;
    }
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] =sc.nextInt();
    }
    System.out.println(maxsub(arr,n,k));
}
}
