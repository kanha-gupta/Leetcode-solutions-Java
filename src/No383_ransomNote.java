import java.util.HashMap;
import java.util.Map;

public class No383_ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        //count magazine count of each character
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }
        //if conditions dont meet then return false
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if(!charFrequency.containsKey(ch) || charFrequency.get(ch) == 0){
                return false;
            } //keeps decrementing until loop ends. if succeeds then it returns true
            charFrequency.put(ch, charFrequency.get(ch)-1);
        }
        return true;
    }
}
