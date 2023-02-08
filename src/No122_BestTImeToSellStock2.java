public class No122_BestTImeToSellStock2 {
    public int maxProfit(int[] prices) {
        //approach would be to keep adding up the profit if i+1 is greater
        //till last index reaches
        //Single pass approach
        int totalPossibleProfit=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i-1]<prices[i]){ //starting from index 1
                totalPossibleProfit= totalPossibleProfit+ prices[i]- prices[i-1];
            } //if this condition doesnt pass, we will move on to next pass
        }
        return totalPossibleProfit;
    }
}
