class Solution {
    public void findcombination(int ind , int[] candidates, int target, List<List<Integer>>ans, ArrayList<Integer> list){
        if(target ==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind ;i<candidates.length;i++){
            if(i > ind && candidates[i-1] == candidates[i] ){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            list.add(candidates[i]);
            findcombination(i+1, candidates, target - candidates[i] , ans , list);
            list.remove(list.size() -1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(candidates);
        findcombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}