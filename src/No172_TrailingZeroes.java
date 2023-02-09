public class No172_TrailingZeroes {

    //by looking at the pattern of factorial answers, there is always a 0
    //at the end of the answer. so to calculate that with time complexity of O(log n)
    //we calculate no. of times n can be divided by 5 with iteration being multiple of 5
    //because ans could be determined by the number of times a number can be divided by 10
    // and 10 is a multiple of 2 & 5 so we chose 5 to have better time complexity
     public int trailingZeroes(int n){
        int ans=0;

        for (int i = 5; i <=n; i*=5) {
            ans= ans+(n/i);
        }
        return ans;
    }

}
