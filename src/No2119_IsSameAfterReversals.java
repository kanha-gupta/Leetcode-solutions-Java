public class No2119_IsSameAfterReversals {
    public boolean isSameAfterReversals(int num) {
        //if theres 0 in last digit of number, return false
        //because on reversal we dont have to consider it.
        if(num ==0 || num%10 !=0){
            return true;
        }
        return false;
    }
}
