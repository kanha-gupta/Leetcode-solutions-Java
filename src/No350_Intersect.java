import java.util.*;

public class No350_Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
      //Time complexity would be O(NlogN) because of inbuilt .sort method
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                result.add(nums1[i]);
                i++;
                j++;
            }
        }
        //we initialise a new array because we have to return an array & not an arraylist
        int[] output = new int[result.size()];
        int counter= 0;
        while(counter < result.size()){
            output[counter] = result.get(counter);
            counter++;
        }
        return output;
    }
}
