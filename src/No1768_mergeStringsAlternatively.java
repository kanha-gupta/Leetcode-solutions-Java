public class No1768_mergeStringsAlternatively {
        public String mergeAlternately(String word1, String word2) {
            char[] result = new char[word1.length() + word2.length()];
            int i = 0;
            int j = 0;
            int k = 0;

            while (i < word1.length() && j < word2.length()) {
                if (k % 2 == 0) { //k is a even and odd counter
                    result[k] = word1.charAt(i++);
                } else {
                    result[k] = word2.charAt(j++);
                }
                k++;
            }
            //below code adds up extra elements
            while (i < word1.length()) {
                result[k++] = word1.charAt(i++);
            }

            while (j < word2.length()) {
                result[k++] = word2.charAt(j++);
            }

            return new String(result);
        }
    }
