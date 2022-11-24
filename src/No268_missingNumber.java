import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No268_missingNumber {
//Set approach. Time complexity is average
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) return i;
        }
        return 0;
    }
    //Mathematical approach. Excellent time complexity
    public int missingNumber2(int[] nums){
        int sum=0;
        int l=nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
        }
        //it applies the logic of sum of natural numbers & substract the sum with it
        //to get the answer. using nums.length
        return l*(l+1)/2 - sum;

    }
}
