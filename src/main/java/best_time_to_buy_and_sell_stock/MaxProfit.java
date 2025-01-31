package best_time_to_buy_and_sell_stock;

public class MaxProfit {
    public int maxProfit(int[] prices) {

        if(prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;


        for(int i = 1; i < prices.length; i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                int profit = prices[i] - minPrice;

                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;

        /*
        //two pointers, find max gap left - right  and  right - left must be big
        int profit = 0;

        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i + 1; j < prices.length; j++){
                int currentProfit = prices[j] - prices[i];

                if (currentProfit > profit){
                    profit = currentProfit;
                }
            }
        }
        return profit;
         */

    }
}
