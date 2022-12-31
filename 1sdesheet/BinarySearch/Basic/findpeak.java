/* The function should return the index of any
   peak element present in the array */

// arr: input array
// n: size of array
class Solution
{
    public:
    int peakElement(int arr[], int n)
    {
       // Your code here
       int start = 0;
       int end = n-1;
       while(start<end){
           int mid = (start + end)/2;
           if(arr[mid] < arr[mid+1]){
               start = mid+1;
           }
           else {
               end = mid;
           }
       }
       return start;
    }
};