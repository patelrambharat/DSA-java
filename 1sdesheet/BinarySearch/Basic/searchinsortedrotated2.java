class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int start= 0;
        int end = n-1;
        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] > nums[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        int pivot = start;
        start =0;
        end = n-1;
        if(nums[pivot] <= target && target <= nums[end]){
            start = pivot;
        } 
        else{
            end = pivot;
        }
        while(start <=end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] < target){
                start = mid +1;
            }
            else{
                end= mid -1;
            }
        }
        return false;
    }
}