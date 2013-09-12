public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = prices.length;
        for(int i = len -1; i>0 ; i--){
            prices[i]= prices[i]-prices[i-1];
        }
        int res = 0;
        int sum = 0;
        for(int i = 1 ; i < len ; i++){
            sum = Math.max(sum + prices[i],prices[i] );
            res = Math.max(sum,res);
        }
        return res;
    }
}
