class Solution
{
    void leftRotate(long arr[], int k,int n)
    {
        //edge case 
        if(n ==0){
            return;
        }
        k = k%n;
        if(k > n)
            return;
        
        long [] temp = new long[k];
	   for(int i=0;i<k;i++){
	       temp[i] = arr[i];
	   }
	   for(int i=0;i<n-k;i++){
	       arr[i] = arr[i+k];
	   }
	   for(int i=n-k;i < n;i++){
	       arr[i] = temp[i-n+k];
	   }
	   
    }
}




//Better Approach
// O(n ) time and O(1) space
class Solution {
    void reverse(int arr[] , int s, int e){
        while(s<=e){
            int temp = arr[s];
            arr[s]  = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    void leftRotate(int[] arr, int n, int k) {
        // code here
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
}
