public class No374_NumberHighOrLow {

    //Using binary search approach. if guess(int n) returns 0 we will terminate 
    //else it will keep on search
    public int guessNumber(int n) {
        int low=1;
        int high=n;
        while (low<=high){
            int mid=low+(high-low)/2;
            int result=guess(mid);
            if(result==0){
                return mid;
            } else if (result<0) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }
    private int guess(int mid) {
        return 0;
    } //this method is unnecessarily method as to not get errors in line 10.

}
