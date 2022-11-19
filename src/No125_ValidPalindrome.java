public class No125_ValidPalindrome {
        public boolean isPalindrome(String s) {
           String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
            int i = 0;
            int j = str.length() - 1;
            while(i <= j) {
                if (str.charAt(i) != str.charAt(j)) {
                    //it terminates if one char is unequal.
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }



