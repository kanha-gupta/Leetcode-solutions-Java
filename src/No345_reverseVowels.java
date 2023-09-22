public class No345_reverseVowels {
    //basically make it as char array, reverse vowels then return as string
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            while(start<end && !isvowel(chars[start])){
                start++;
            }
            while (start<end && !isvowel(chars[end])){
                end--;
            }
            if (start<end) {
                char temp = chars[start];
                chars[start]= chars[end];
                chars[end]=temp; //can create a method to improve readability
                start++;
                end--;
            }
        }
        return new String(chars);
    }
    private boolean isvowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c=='O' || c=='U';
    }
}
