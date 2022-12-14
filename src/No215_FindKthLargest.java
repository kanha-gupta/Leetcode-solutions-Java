import java.util.Arrays;

public class No215_FindKthLargest {
   //the solutions require using quickselect algorithm as it asks to keep time complexity of O(N)
    //if we use inbuilt functions it would have time complexity of O(Nlogn)
    public int findKthLargest(int[] nums, int k) {
        int start=0;
        int end=nums.length-1;
        int index=nums.length-k;
        while (start<end){
            int pivot=partition(nums,start,end);
            if(pivot<index){
                start=pivot+1;
            } else if (pivot>index) {
                end=pivot-1;
            }
            else return nums[pivot];
        }
        return nums[start];
    }
    public int partition(int[]nums, int start,int end){
        int pivot=start,temp;
        while (start<=end){
            while (start<=end && nums[start]<= nums[pivot]){
                start++;
            }
            while (start<=end && nums[end]> nums[pivot]){
                end--;
            }
            if(start>end){
                break;
            }
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]= temp;

        }
        temp=nums[end];
        nums[end]= nums[pivot];
        nums[pivot]= temp;
        return end;
    }
}
