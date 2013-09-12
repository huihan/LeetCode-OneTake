public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = prices.length;
        int res = 0;
        for(int i = 1 ; i < len ;i++){
            res = Math.max(res, res+prices[i] - prices[i-1]);
        }
        return res;
    }
}
