class Solution {
    List<List<Integer>>ans  = new ArrayList<>();

     void solve(int[] candidates, int target, int ind, int n , List<Integer>list){
        if( ind >= n || target < 0){
            return;
        }
        if(target ==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(candidates[ind]);        
        solve(candidates, target - candidates[ind] , ind , n , list);  //include
        list.remove(list.size() -1);
        solve(candidates, target, ind +1, n, list);  //exclude

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates, target, 0, candidates.length , new ArrayList<>());
        return ans;
    }
}