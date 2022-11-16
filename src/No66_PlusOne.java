import java.lang.reflect.Array;
import java.util.Arrays;

public class No66_PlusOne {
    public int[] plusOne(int[] digits) {
       //reverse iteration
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        //now for numbers for which we have to increase array size,we will do
        //place 1 at 0th index & increase the size of new array by 1
        int[] newarr=new int[digits.length+1];
        newarr[0]=1;
        return newarr;
    }
}
