class Solution {
    
    public void backtracking(  List<String>ans, int n , String curr, int open , int close){
        if(curr . length() == 2 * n){
            ans.add(curr);
            return;
        }
        if(open < n){
            backtracking(ans , n , curr +'(' , open +1, close);
        }
        if(close < open){
            backtracking(ans, n, curr + ')' , open , close +1);
        }
    }
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String>ans = new ArrayList<String>();
        backtracking(ans, n, "", 0 , 0);
        return ans;
    }
}