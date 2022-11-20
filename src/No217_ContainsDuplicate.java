import java.util.HashSet;
import java.util.Set;

public class No217_ContainsDuplicate {
    //not a very fast solution. Need improvements
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet(nums.length);
            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])){
                    return true;
                }
                //it keeps adding & if a element already exist it returns true
                set.add(nums[i]);
            }
            return false;
        }
    }

