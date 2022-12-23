class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int even =0;
        int odd =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                ans[even] = nums[i];
                even  =even + 2;
                }
            else{
                ans[odd] = nums[i];
                odd = odd +  2;
            }
        }
        return ans;
    }
}