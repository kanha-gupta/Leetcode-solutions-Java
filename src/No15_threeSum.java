import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No15_threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            } //skipping same value
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                int sum = nums[i]+ nums[j]+ nums[k];
                if (sum<0) {
                    j++; //logical
                } else if (sum>0) {
                    k--; //logical
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++; //increment if duplicate
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--; //decrement if duplicate
                    }
                }
            }
        }
        return ans;
    }
}
