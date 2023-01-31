public class No28_FIndIndexOfFirstOccurence {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        for (int i = 0; i <= n-m; i++) {
            for (int j = 0; j < m; j++) {
                if(needle.charAt(j)!= haystack.charAt(i+j)){
                    break;
                } //j will reach m-1 only if all chars are same.
                //else it will keep moving & i value will keep increasing
                if(j==m-1){
                    return i;
                }
            }
        }
        return -1;
    }
}
