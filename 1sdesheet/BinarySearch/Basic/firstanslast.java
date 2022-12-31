class GFG
{
    
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
        int start =0;
        int end = n-1;
        while(start <= end){
            int mid1= (start + end)/2;
            if(arr[mid1] == x){
                ans.add(mid1);
                end = mid1-1;
            }
            if(arr[mid1] > x){
                end = mid1 -1;
            }
            else if(arr[mid1] <x){
                start = mid1 +1;
            }
            
        }
        


    }
}


//binary search approach
class Solution {

    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int firstans = -1;
        int lastans = -1;
       
        int start =0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end-start) /2;
            if(nums[mid] == target){
                firstans = mid;
                end = mid -1;
            }
            if(nums[mid] < target){
                start = mid +1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
        }
        ans[0] = firstans;
        start =0;
        end = nums.length -1;
        while(start <= end){
            int mid = start + (end-start) /2;
            if(nums[mid] == target){
                lastans = mid;
                start = mid +1;
            }
            if(nums[mid] < target){
                start = mid +1;
            }
             else if(nums[mid] > target){
                end = mid-1;
            }
           
        }
         ans[1] = lastans;
         return ans;
    }
}