class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], maxProfit = 0, n = prices.length;
        for(int i=0;i<n;i++){
            int profit = prices[i]-minPrice;
            maxProfit = Math.max(maxProfit,profit);
            minPrice = Math.min(minPrice,prices[i]);
        }
        return maxProfit;
    }
}
/*
prices = {7,1,5,3,6,4}
profit = max(profit,price-min)
Here we are taking the previous minimum prce to buy
min = 1 
price = 7 profit = 0
price = 1 profit = -6
price = 5 profit = 4
price = 3 profit = 2
price = 6 profit = 5
price = 4 profit = 3
*/