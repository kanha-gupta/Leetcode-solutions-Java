public class No55_JumpGame {
    public static void main(String[] args) {
        int[] arr={3,2,1,0,4};
        canJump(arr);
    }
    static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i=0; i<nums.length; ++i) {
            if (i > reachable){
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
