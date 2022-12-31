class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start=0;
        int end = n-1;
        while(start<end){            //iska use krke pivot find kiya 
            int mid = (start + end) /2;
            if(nums[mid]  > nums[end]){
                start = mid +1;

            }
            else{
                end = mid;
            }
        }
        int pivot = start;        //abhi pivot pe start set kiya  pivot ==0
        start=0;
        end = n-1;
        if(nums[pivot] <= target && target <= nums[end] ){  // let 1 target 0 < 1 && 1 < 2 right side
                                             
            start = pivot;                                              //nums[pivot] <=target to right
        }
        else{
            end = pivot;                //nums[pivot] >=target --> left side
        }
        while(start <=end){
            int mid  = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid +1;
            }
            else if(nums[mid] > target){
                end = mid -1;
            }
        }
        return -1;
    }
}