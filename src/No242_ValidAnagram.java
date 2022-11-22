import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class No242_ValidAnagram {
    public boolean isAnagram(String s,String t){
        Map<Character,Integer> map1=new HashMap<Character,Integer>();
        Map<Character,Integer> map2=new HashMap<Character,Integer>();
        if(s.length()!=t.length()){
            return false;
        }
            //filling first map
            for (int i = 0; i < s.length(); i++) {
                if(map1.containsKey(s.charAt(i))){
                    map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
                }
                else {
                    map1.put(s.charAt(i),1);
                }
            }
            //filling 2nd map
            for (int i = 0; i < t.length(); i++) {
                if(map2.containsKey(t.charAt(i))){
                    map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
                }
                else{
                    map2.put(t.charAt(i),1);
                }
            }
        return map1.equals(map2);
    }
}
