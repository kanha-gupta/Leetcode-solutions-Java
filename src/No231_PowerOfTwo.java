public class No231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
    //using log function. if log2(n) is an integer, then it means n is power of two
        if(n==0){
            return false;
        }
        if(n==1 || n==2){
            return true;
        }
        // modulo is used to check if log division gives int or float number
        return (Math.log10(n)/Math.log10(2)) %1==0;

    }
}
