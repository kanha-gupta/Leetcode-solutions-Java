import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No1_twosum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=26;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++) {
            //if condition checks whether map contains the other value of sum. if it doesnt, else condition is applied
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }else {
                //it is filling the map one by one if it doesnt gets the required answer.
                map.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
    }
