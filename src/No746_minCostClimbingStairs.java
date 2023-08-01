public class No746_minCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int[n]; //we implement values in an array to reduce time complexity from exponential to linear
        for (int i = 0; i < n; i++) {
            if (i<2) {
                dp[i]=cost[i];
            } else {
                dp[i]= cost[i] + Math.min(dp[i-1], dp[i-2]); //stores then finds minimum of it during next iteration.
            } //after iteration ends, new array is full with processed values & we return whichever is minimum of last 2 index
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}
