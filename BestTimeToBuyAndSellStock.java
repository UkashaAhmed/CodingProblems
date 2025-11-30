class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxPrice = 0;
        for(int i=0;i<prices.length;i++){
            maxPrice= Math.max(maxPrice,prices[i]-minPrice);
            minPrice = Math.min(minPrice,prices[i]);
        }
        return maxPrice;
    }
}
