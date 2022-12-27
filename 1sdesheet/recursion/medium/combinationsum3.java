class Solution {
    public static void solve(List<List<Integer>>ans , int start , int k, int n , ArrayList<Integer>list){
        if(n < 0) return;
        if(k==0 && n==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start ;i<=9;i++){
            list.add(i);
            solve(ans, i+1, k-1, n-i, list);
            list.remove(list.size() -1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans = new ArrayList<>();
        
        solve(ans, 1, k , n, new ArrayList<>());

        return ans;
    }
}