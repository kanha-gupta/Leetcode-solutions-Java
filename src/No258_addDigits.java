public class No258_addDigits {
    public int addDigits(int num) {
        while (num / 10 != 0) {
            int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                sum=sum+rem;
                num /=10;
            }
            if(sum/10==0){
                return sum;
            }
            else {
                num=sum;
            }
        }
        return num;
    }
}
