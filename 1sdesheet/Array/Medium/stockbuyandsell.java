class Solution {
    public int maxProfit(int[] prices) {
        int maxpro =0;
        for(int i=0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                if(prices[j] > prices[i]){
                    maxpro = Math.max(prices[j] - prices[i] , maxpro);
                }
            }
        }
        return maxpro;
    }
}