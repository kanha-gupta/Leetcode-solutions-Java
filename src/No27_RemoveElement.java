public class No27_RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i=0; //counter to fill new array
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!= val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
