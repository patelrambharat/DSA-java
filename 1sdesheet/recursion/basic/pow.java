class Solution {
    public double myPow(double x, int n) {
        if( n ==0){
            return 1;
        }
        if(n < 0){
            return 1/ x * myPow(1/ x, -(n+1));
        }
        double v = myPow(x, n/2);
        if( n % 2 ==0){
            return v*v;
        }
        else{
            return x*v*v;
        }

    }
}