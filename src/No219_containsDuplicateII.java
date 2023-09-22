import java.util.HashMap;

public class No219_containsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if (map.containsKey(nums[i])) {
                if ((i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    } //Below is TLE error solution
    // for(int i = 0; i<= nums.length; i++){
    //     for(int j = i+1; j<=nums.length-1; j++) {
    //         if (nums[i]==nums[j]) {
    //     if ((Math.abs(i-j)) <= k) {
    //         flag = true;
    //     }
    // }
    //     }
    // }
    // return flag;
}
