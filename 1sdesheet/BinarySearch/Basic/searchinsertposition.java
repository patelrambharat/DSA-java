class Solution
{
    static int searchInsertK(int arr[], int n, int k)
    {
        // code here
        int start=0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid]  < k){
                start =mid +1;
                
                
            }
            else if(arr[mid] > k ){
                end = mid -1;
            }
        }
        return start;
    }
}