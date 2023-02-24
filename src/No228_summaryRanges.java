import java.util.ArrayList;
import java.util.List;

public class No228_summaryRanges {
    public static void main(String[] args) {
        int[]arr={0,1,2,4,5,7};
        summaryRanges(arr);
    }
    static List<String> summaryRanges(int[] nums) {
        ArrayList<String> result=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start= nums[i]; //assigns number for comparison
            while (i+1< nums.length && nums[i]+1==nums[i+1]){
                i++; //increase range till numbers are not continuos
            }
            if(start!=nums[i]){ //this code creates summary range
                result.add(""+start+"->"+nums[i]);
            }
            else { //this creates singular numbers which have no range & previous numbers are in another ranges.
                result.add(""+start);
            }
        }
        return result;
    }
}
