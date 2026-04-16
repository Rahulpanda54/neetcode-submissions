class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;     int curr = prices[0];

        for(int i=0; i<prices.length; i++){

            int diff = prices[i] - curr;

            max = Math.max(max, diff);

            curr = Math.min(curr, prices[i]);
        }

        return max;
    }
}
