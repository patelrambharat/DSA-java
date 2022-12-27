class Solution{
    public static void solve(ArrayList<Integer>arr, int n , ArrayList<Integer>ans, int ind , int sum){
        if(ind == n){
            ans.add(sum);
            return;
        }
        solve(arr, n , ans , ind +1, sum + arr.get(ind));    //pick the element
        
        solve(arr, n, ans, ind +1, sum );
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer>ans = new ArrayList<>();
         solve(arr, N, ans, 0, 0);
         Collections.sort(ans);
         return ans;
    }
}