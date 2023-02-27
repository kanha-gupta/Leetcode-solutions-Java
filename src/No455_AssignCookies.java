import java.util.Arrays;

public class No455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while (i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
            } //i is the number of children that can get content
            j++;
        }
        return i;
    }
}
