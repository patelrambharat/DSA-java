public int missingNumber(int arr[], int n)
{
    // Your code goes here
    int s = n*(n+1)/2;
    int sum =0;
    for(int i=0;i<n-1;i++){
        sum += arr[i];
    }
    return s-sum;
} {
    
}
