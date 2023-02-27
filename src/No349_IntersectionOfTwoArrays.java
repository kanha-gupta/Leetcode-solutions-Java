import java.util.HashSet;
import java.util.Set;

public class No349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        //give common elements of both.ONLY ONCE
        Set<Integer> set1= new HashSet<>();
        for (int i:nums1){
            set1.add(i);
        }
        Set<Integer> set2=new HashSet<>();
        for(int i:nums2){
            set2.add(i);
        }
        Set<Integer> resultSet= new HashSet<>();
        for (Integer var: set1){
            if(set2.contains(var)){
                resultSet.add(var);
            }
        }
        //convert resultset to array
        int[] arr= new int[resultSet.size()];
        int j=0;
        for(int num: resultSet){
            arr[j++]= num;
        }
        return arr;
    }
}
