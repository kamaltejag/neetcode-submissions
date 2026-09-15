class Solution {
    public int maxProfit(int[] prices) {
        int lp = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < lp){
                lp = price;
            }
            else{
                maxProfit = Math.max(maxProfit, price - lp);
            }
        }
        return maxProfit;
    }
}
