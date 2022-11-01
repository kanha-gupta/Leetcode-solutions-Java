import java.util.Arrays;
import java.util.Stack;

public class No283_MoveZeroes {
    public static void main(String[] args) {
        int[] arr={1,2,0,0,3,4,0};
        moveZeroes(arr);
    }
    static void moveZeroes(int[] nums){
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[counter]=nums[i];
                counter++;
            }//this fills up all the non zero integers.
        }
        //below loop fills all the remaining spaces with 0.
        for (int i = counter; i < nums.length; i++) {
            nums[counter]=0;
            counter++;
        }
    }
}
