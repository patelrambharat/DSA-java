class Solution {
    private String[] keyword = new String[]{" ", "" , "abc" , "def" , "ghi" , "jkl", "mno" ,"pqrs", "tuv", "wxyz"};
    public void solve(String digits, int ind, String str, List<String>ans){
        if(digits.length() == ind){
            ans.add(str);
            return;
        }
        String s = keyword[digits.charAt(ind) -'0'];

        for(char ch : s.toCharArray()){
            solve(digits, ind +1, str + ch , ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        solve(digits, 0, "" , ans);
        return ans;
    }
}