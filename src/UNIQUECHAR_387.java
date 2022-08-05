import java.util.HashMap;
//387. First Unique Character in a String
public class UNIQUECHAR_387 {
    public static void main(String[] args) {
        System.out.println(uniquechar("leetcode"));
    }
    static int uniquechar(String s){
        HashMap<Character,Integer> map= new HashMap<Character,Integer>();
        for (int i = 0; i < s.length() ; i++) {
            char current = s.charAt(i);
            if(!map.containsKey(current)){
                map.put(current,i);
            }
            else {
                map.put(current,-1);
            }
        }
        //The above code prepares the Hashmap for further analysation
        int min=Integer.MAX_VALUE;
        for(char c: map.keySet()){
            if(map.get(c)> -1 && map.get(c)< min){
                min=map.get(c);
            }
        }
        return min ==Integer.MAX_VALUE ? -1:min;
    }
}
