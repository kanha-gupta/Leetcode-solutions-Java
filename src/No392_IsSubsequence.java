public class No392_IsSubsequence {
    //Time complexity O(N) N is length of t
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int sActualLength = 0;
        for (int i = 0; i < t.length(); i++) {
            if (sActualLength<s.length() && t.charAt(i)== s.charAt(sActualLength)) {
                sActualLength++;
            }
        }
        if (sActualLength == s.length()) {
            return true;
        }
        return false;
    }
}
