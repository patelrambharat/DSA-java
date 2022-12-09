import java.util.*;
public class findkthmaxandmin {
    
    public static int findkthmin(int arr[] , int start , int end, int k){
        int n = end +1;
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findkthmin(arr, 0 ,n-1, k));
    }
    
}
