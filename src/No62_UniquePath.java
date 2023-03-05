public class No62_UniquePath {
    public int uniquePaths(int m, int n) {
        //uses DP
        int[][] dp=new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0]=1;
        } //putting one to first row
        for (int i = 0; i < n; i++) {
            dp[0][i]=1;
        } //putting one to first column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j]= dp[i-1][j] + dp[i][j-1];
            } //earlier calculations help in current equation.
            //formula adds both possible DOWN and RIGHT movements after taking a move

        }
        return dp[m-1][n-1];
    }
}
