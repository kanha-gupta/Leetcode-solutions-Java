import java.util.Arrays;

public class No414_ThirdMaxNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=nums.length-1; i>0;i--) { //if duplicate elements are found, code simply iterates
            if (nums[i]> nums[i-1]){
                count = count +1;
            }
            if (count == 2){
                return nums[i-1];  //count of 2 will notify that we found third max
            }
        }
        return nums[nums.length-1];
    }
}
