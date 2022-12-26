class Solution {
    int mod = (int)1e9+7;
    public long pow(long x, long n){
        if(n == 0)
            return 1;
        long v= pow(x, n/2);
        if(n %2==0){
            return (v*v) % mod;
        }
        else{
            return (x*v*v) % mod;
        }
    }
    public int countGoodNumbers(long n) {
       long even = n /2 + n%2;
       long odd = n /2;
       long mul1 = pow(5, even) % mod;
       long mul2 = pow(4, odd) % mod;
       return (int) ((mul1 * mul2) % mod); 
    }
}