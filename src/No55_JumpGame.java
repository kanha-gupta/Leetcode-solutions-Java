public class No55_JumpGame {
    public boolean canJump(int[] nums) {
        int MaxJumpReach = 0;
        for (int i=0; i<nums.length; ++i) {
            //the main thing to care about is that i shouldnt get greater than MaxJumpReach because if it does,
            //it will mean that we cannot reach to the last index & code should terminate
            if (i > MaxJumpReach){
                return false;
            }
            MaxJumpReach = Math.max(MaxJumpReach, i + nums[i]);
        }
        return true;
    }
}
