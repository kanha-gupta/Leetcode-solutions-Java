public class No34_searchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        //implementing binary search
        int left=0;
        int right= nums.length-1;
        while (left<right){
            int mid=left + (right - left)/2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        if(nums[left] != target){
            return result;
        }
        result[0] = left; //first digit index is allocated

        right=nums.length-1; //initiating loop again
        while (left<right){
            int mid= left + (right-left+1)/2;
            if(nums[mid]>target){
                right=mid-1;
            } else {
                left=mid;
            }
        }
        result[1]=right;
        return result;
    }
}
