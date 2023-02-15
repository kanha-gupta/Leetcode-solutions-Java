import java.util.HashMap;
import java.util.Map;

public class No205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<Character,Character>();
        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){ //code checks if both the characters match in sequence, if not it returns false
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i)))
            {
                map.put(s.charAt(i),t.charAt(i)); //this puts both string Characters in a sequence
            }
            else if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))==t.charAt(i))
            {
                continue;
            }
            else
            {
                return false;
            } //return false if character is incorrectly mapped that is- string is not isomorphic
        }
        return true;
    }
}
