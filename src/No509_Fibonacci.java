public class No509_Fibonacci {
    public int fib(int n) {
        //we implement DP for best time complexity
        if (n==0 || n==1) {
            return n;
        }
        int[] ans = new int[n+1];
        ans[0]=0;
        ans[1]=1;
        for (int i = 2; i <= n; i++) {
            ans[i]= ans[i-1] + ans[i-2];
        } //this stores each value till i so that unnecessary call stack is avoided.
        //next ith value uses previous Ith value
        return ans[n];
    }
}
