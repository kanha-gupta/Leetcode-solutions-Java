import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class No347_topKfrequent {
   public int[] topKFrequent(int[] nums,int k){
       if(k==nums.length){
           return nums;
       }
       //count top recurring numbers
       Map<Integer,Integer> map= new HashMap();
       for (int i = 0; i <nums.length ; i++) {
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);
       }
       Queue<Integer> heap= new PriorityQueue<>(
               (n1,n2) -> map.get(n1) - map.get(n2)
       );
       for(int n: map.keySet()){
           heap.add(n);
           if(heap.size() > k){
               heap.poll();
           }
       }
       int[] result= new int[k];
       for (int i = k-1; i>=0; --i) {
           result[i]=heap.poll();
       }
       return result;
   }
}
