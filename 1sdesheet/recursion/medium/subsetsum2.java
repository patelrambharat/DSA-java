class Solution {
    public static void solve(int ind , int[] nums, ArrayList<Integer>list, List<List<Integer>>ans){
        ans.add(new ArrayList<>(list));
        for(int i= ind ;i<nums.length;i++){
            if(i != ind && nums[i] == nums[i-1])  continue;
            list.add(nums[i]);
            solve(i+1, nums, list, ans);
            list.remove(list.size() -1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        solve(0 , nums, new ArrayList<>(), ans );
        return ans;
    }
}