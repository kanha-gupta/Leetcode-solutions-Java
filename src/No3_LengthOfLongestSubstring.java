import java.util.HashMap;
import java.util.Map;

public class No3_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //sliding window approach- 2 Pointers
       Map<Character, Integer> map= new HashMap<>();
       int left=0;
       int right=0;
       int result=0; //Result is the max difference of left & right
        //the code traverses both from left and right & Maps the Character with the index of the Char Array
        while(right<s.length()){
            char charRight=s.charAt(right);
            map.put(charRight, map.getOrDefault(charRight,0)+1);

            while (map.get(charRight)>1){
                char charLeft=s.charAt(left);
                map.put(charLeft, map.get(charLeft)-1);
                left++;
            }
            result=Math.max(result, right-left+1);
            right++;
        }
      return result;
    }
}
