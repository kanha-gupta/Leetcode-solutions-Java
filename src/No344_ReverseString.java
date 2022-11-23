public class No344_ReverseString {
    //it is basically reverse an array question
    public void reverseString(char[] s) {
        int start = 0;
        int end=s.length-1;
        char temp=0;
       while (start<end){
           temp=s[start];
           s[start]= s[end];
           s[end]= temp;
           start++;
           end--;
       }
    }
}
