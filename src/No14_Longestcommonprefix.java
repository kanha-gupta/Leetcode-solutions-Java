public class No14_Longestcommonprefix {
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
//vertical scanning approach is used. Worst case time complexity O(m.n).
//it scans first char of every element of every index & continues traverse only if chars are equal.
    static String longestCommonPrefix(String[] str){
        if (str == null || str.length == 0) return "";
        for (int i = 0; i < str[0].length() ; i++) {
            char c=str[0].charAt(i);
            for (int j = 0; j < str.length; j++) {
                if(i== str[j].length() || str[j].charAt(i)!=c){
                    return str[0].substring(0,i);
                }
            }
        }
        return str[0];
    }

}
