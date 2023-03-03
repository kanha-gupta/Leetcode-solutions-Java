public class No367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        //using binary search
        //time complexity O(log n)
        long start=1;
        long end=num;
        while (start<=end){
            long mid= (start+end)/2;
            if(mid*mid==num){
                return true;
            }
            else if (mid*mid > num) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
