public class No263_UglyNumber {
    public boolean isUgly(int n) { //using recursive approach
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        } //only true condition
        if(n%2==0){
            return isUgly(n/2);
        }
       else if(n%3==0){
            return isUgly(n/3);
        }
        else if(n%5==0){
            return isUgly(n/5);
        }
        return false;
    }
}
