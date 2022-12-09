import java.util.*;
public class findkthminutilize {
    public static int kthmin(int arr[] , int start , int end , int k){
        int n = end - start +1;
        priority_queue<int>minheap;
        for(int i=;i<k;i++){
            minheap.push_(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(arr[i] < minheap.top()){
                minheap.pop();
                minheap.push(arr[i]);
            }
        }
        return minheap.top();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(kthmin(arr, 0, n-1, k));
    }
}
