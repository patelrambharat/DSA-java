class Solution {
    private static void getList(int ind , String str, int n , List<String>ans){
        if(ind ==n){
            ans.add(str);
            return;
        }
        getList(ind +1, str +'0' , n, ans);
        
        if(ind >0 && str.charAt(ind-1) == '1'){
            
            return;
        }
        getList(ind +1, str + '1' , n, ans);
    }
  public static List<String> generateBinaryStrings(int n) {
    // code here
    List<String>ans = new ArrayList<>();
    getList(0, "", n, ans);
    
    return ans;

  }
}