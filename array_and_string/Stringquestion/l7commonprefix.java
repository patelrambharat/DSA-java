class Solution {
    public String longestCommonPrefix(String[] strs) {

       if(strs == null || strs.length ==0){
           return "";
       } 
       String lcp = strs[0];
       for(int i=1;i<strs.length;i++){
           String currword = strs[i];
           int j =0;
           while(j<currword.length() && j<lcp.length() && currword.charAt(j) == lcp.charAt(j)){
               j++;
           }
           if(j==0){
               return "";
           }
           lcp = currword.substring(0, j);
       }
       return lcp;
    }
}