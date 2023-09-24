public class No34_searchRange {
    public int[] searchRange(int[] nums, int target) {
        int [] result = {-1,-1};
        result[0] = searchLeft(nums, target);
        result[1]= searchRight(nums, target);
        return result;

    }
    private int searchLeft(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        int index = -1;
        while(left<= right){
            int mid = left + (right-left)/2;
            if (nums[mid]==target){
                index = mid;
                right = mid-1;
            }
            if (nums[mid]< target){
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        return index;
    }
    private int searchRight(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid]== target){
                index = mid;
                left = mid+1;
            }
            else if (nums[mid]< target){
                left =mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return index;
    }
}
