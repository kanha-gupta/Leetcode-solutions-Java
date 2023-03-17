public class No7_reverseInteger {
    public int reverse(int x) {
        int y=0;
        int sum=0;
        while (x!=0){
            y=x%10;
            sum=sum*10+y;
            x=x/10;
            //below code to satisfy one of test cases
            if((sum<(-214748364) && x!=0) || (sum > 214748364 && x!=0))
            {
                return 0;
            }
        }
        return sum;
    }
}
