public class No152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        //we will use 2 pointer approach

        int maxProduct=Integer.MIN_VALUE;
        int left=1;
        int right=1;
        for (int i = 0; i < nums.length; i++) {
            left=left*nums[i];
            right=right*nums[nums.length-i-1];
            //we will take out the max value from either left or right continuous traversal & store in Math.max function
            //since it is a single traversal solution 2 pointer approach is easy to understand
            //it is comparable to LEETCODE#53 question.
            maxProduct=Math.max(maxProduct,Math.max(left,right));
            if(left==0){
                left=1;
            } //it is implemented to avoid getting 0 as an answer.
            if(right==0){
                right=1;
            }
        }
        return maxProduct;
    }
}
