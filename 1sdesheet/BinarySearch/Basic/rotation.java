class Solution{
    public:	
        int findKRotation(int arr[], int n) {
            // code here
            int min = arr[0] ,  minindex = 0;
            for(int i=0;i<n;i++){
                if(min > arr[i]){
                    min = arr[i];
                    minindex =i;
                }
            }
            return minindex;
        }
    
    };