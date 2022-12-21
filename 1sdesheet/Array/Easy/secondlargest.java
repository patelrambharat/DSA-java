
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int maxi = arr[0];
        int secondmaxi = -1;
        for(int i=1;i<n;i++){
            if(arr[i] > maxi){
                secondmaxi = maxi;
                maxi = arr[i];
            }
            if(arr[i] < maxi && arr[i] > secondmaxi){
                secondmaxi = arr[i];
            }
        }
        return secondmaxi;
    }
}