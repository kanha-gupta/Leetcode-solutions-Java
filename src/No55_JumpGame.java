public class No55_JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int finalPosition = n-1; //sets last index as position
        for(int i = n-2; i>=0; i--){  //start from 2nd last element and checks if left elements add up to reach the final position
            if (i + nums[i]>= finalPosition) {
                finalPosition = i; //if criteria fulfills, finalPosition keeps shifting left until no more elements are left to traverse
            }
        }
        return finalPosition ==0;
    }
}
