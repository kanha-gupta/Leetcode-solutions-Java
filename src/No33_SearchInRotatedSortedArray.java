public class No33_SearchInRotatedSortedArray {
    //Time complexity O(N), needs optimisation -> need to implement binary tree on it
    //
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (target == nums[i]){
                return i;
            }
        return -1;
    }
}
