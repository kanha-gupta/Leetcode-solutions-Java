package LeetcodeDailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class No1704_StringsHalvesAlike {
    public boolean halvesAreAlike(String s) {
        Map<Character,Integer> hashmap=new HashMap<>();
        hashmap.put('a',1);
        hashmap.put('e',1);
        hashmap.put('i',1);
        hashmap.put('o',1);
        hashmap.put('u',1);
        hashmap.put('A',1);
        hashmap.put('E',1);
        hashmap.put('I',1);
        hashmap.put('O',1);
        hashmap.put('U',1);
        //we'll count no. of vowels using for loops
        //Time complexity O(N)
        int firsthalfcounter=0;
        int secondhalfcounter=0;
        for (int i = 0; i < s.length()/2; i++) {
            if(hashmap.containsKey(s.charAt(i))){
                firsthalfcounter++;
            }
        }
        for (int i = s.length()/2 ; i <s.length(); i++) {
            if(hashmap.containsKey(s.charAt(i))){
                secondhalfcounter++;
            }
        }
        if(firsthalfcounter==secondhalfcounter){
            return true;
        }
        return false;
    }
}
