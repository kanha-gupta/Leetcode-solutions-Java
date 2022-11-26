import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class No350_Intersect {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.print(intersect(nums1,nums2));
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        //iterate 2nd array
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                result.add(nums2[i]);
                int freq=map.get(nums2[i]);
                freq--;
                map.put(nums2[i],freq);
            }
        }
    }
}
