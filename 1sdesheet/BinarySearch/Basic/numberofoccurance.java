class Solution {
    int count(int[] nums, int n, int target) {
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
        if(ans[1] == -1 || ans[0] == -1){
            return 0;
        }
        int cnt =  ans[1] - ans[0] ;
        return cnt+1;
    }
}