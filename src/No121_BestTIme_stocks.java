public class No121_BestTIme_stocks {
    public static void main(String[] args) {
        int[]arr={2,3,8,10,1};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices){
        int buyprice=Integer.MAX_VALUE;
        int max_profit=0;
        for (int i = 0; i <prices.length; i++) {
            if(buyprice>prices[i]){
                buyprice=prices[i];
            } else if (prices[i]- buyprice> max_profit) {
                max_profit=prices[i]-buyprice;
            }

        }
        return max_profit;
    }
}
