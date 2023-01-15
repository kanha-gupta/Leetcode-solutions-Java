public class No238_productExceptSelf {
        public int[] productExceptSelf(int[] nums){
        //time complexity O(N) single traversal
        int[] result=new int[nums.length];
        int[] prefixProductFromStart=new int[nums.length];
        int[] prefixProductFromEnd= new int[nums.length];

        prefixProductFromStart[0]=nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefixProductFromStart[i]= prefixProductFromStart[i-1]*nums[i];
            }

            prefixProductFromEnd[nums.length-1]=nums[nums.length-1];
            for (int i = nums.length-2; i >=0; i--) {
                prefixProductFromEnd[i]= prefixProductFromEnd[i+1]*nums[i];
            }

            result[0]=prefixProductFromEnd[1];
            result[nums.length-1]=prefixProductFromStart[nums.length-2];
            for (int i = 1; i < nums.length-1; i++) {
                result[i]= prefixProductFromStart[i-1]* prefixProductFromEnd[i+1];
            }
            return result;
        }

    public int[] productExceptSelf2(int[] nums) {
            //time complexity O(N*N) Nested loop
        int[] result=new int[nums.length];

        for (int i = 0; i <= nums.length-1 ; i++) {
            result[i]=1;
            for (int j = 0; j < nums.length; j++) {
                if(i==j){
                    if(j==nums.length-1){
                        break;
                    }
                    j++;
                }
                result[i]= result[i]*nums[j];
            }
        }
        return result;
    }
}
