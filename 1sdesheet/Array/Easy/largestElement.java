// Largest Element in Array
// BasicAccuracy: 67.48%Submissions: 148K+Points: 1
// Lamp
// Bag Offers from Top Product Companies. Explore Exclusive Problems Now!  

// Given an array A[] of size n. The task is to find the largest element in it.
 

// Example 1:

// Input:
// n = 5
// A[] = {1, 8, 7, 56, 90}
// Output:
// 90
// Explanation:
// The largest element of given array is 90.

class Compute {
    
    public int largest(int arr[], int n)
    {
        int largest = -1;
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}