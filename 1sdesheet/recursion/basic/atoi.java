class Solution {
    public int myAtoi(String str) {
        
      if(str == null || str.length()==0) return 0;
        // trim white spaces
        str = str.trim();
        
        // check negative or positive
        char flag = '+'; 
        int i=0;
        
        
        if(str.charAt(0)=='-'){
            flag = '-';
            i++;
        }
        else if(str.charAt(0)=='+')
            i++;
        // else str = "+" + str;
         
        // Store Result
        double res = 0;
        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            res = res * 10 + (str.charAt(i)-'0');
            i++;
        }
        
        if(flag == '-')
            res = -res;
        
        // handle max and min
        if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int)res;
    }
}