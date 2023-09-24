public class No238_productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        int [] result = new int[nums.length];
        int product = 1;
        for(int i = 0; i<nums.length;i++){
            product = nums[i] * product;
            left[i] = product;
        }
        product = 1;
        for(int i = nums.length-1; i>= 0; i--){
            product = nums[i] * product;
            right[i]=product;
        }

        result[0] = right[1]; //since no left array elements
        result[nums.length-1] = left[nums.length-2]; //since no right array elements left
        for(int i = 1; i<nums.length-1; i++ ){
            result[i] = left[i-1] * right[i+1];
        }
        return result;
    }
}
