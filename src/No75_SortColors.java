public class No75_SortColors {
    //basically a sorting question with duplicate integers values
    public void sortColors(int[] nums){
        int red=0,white=0,blue=0;
        for(int num:nums){
            if(num==0){
                red++;
            }
            if(num==1){
                white++;
            }
            else {
                blue++;
            }
        }//first loop counts the quantity of colors in an array
        for (int i = 0; i < red; i++) {
            nums[i]=0;
        } //will fill all 0s
        for (int i = red; i < red+white; i++) {
            nums[i]=1;
        } //will fill all 1s
        for (int i = red+white; i < nums.length; i++) {
            nums[i]=2;
        } //will fill all 2s
    }
}
