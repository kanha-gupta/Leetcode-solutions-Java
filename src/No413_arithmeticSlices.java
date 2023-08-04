public class No413_arithmeticSlices {
    //we use Arithmetic progression formula in if condition to increment slices value
    public int numberOfArithmeticSlices(int[] nums) {
        int slices = 0; //conditional counter
        int prev = 0;// increment counter
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                prev ++;
                slices = slices + prev;
            }
            else {
                prev = 0;
            }
        }
        return slices;
    }
}
