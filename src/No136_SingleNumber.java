public class No136_SingleNumber {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,4,4};
        System.out.println(singleNumber(arr));
    }
    static int singleNumber(int[] nums){
        int xor=0;
        for (int i = 0; i < nums.length; i++) {
            //We are implementing XOR gate in this
             xor=xor^nums[i];
        }
        return xor;
    }
}
