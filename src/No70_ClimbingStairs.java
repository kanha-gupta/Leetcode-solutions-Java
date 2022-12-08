public class No70_ClimbingStairs {
    //this is a DP solution using array. Tried recursive but TLE occured
    public int climbStairs(int n){
        int []a=new int[n+1];
        a[0]=1;
        a[1]=1; //these 2 values are set to avoid error inside for loop
        for (int i = 2; i <=n ; i++) {
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
}
