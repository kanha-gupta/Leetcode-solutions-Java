public class No67_AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1011","1011"));

    }
    static String addBinary(String a, String b) {
        int i=0;
        int carry=0;
        String ans="";
        //below loop sets value if 1 if character is identified else its 0 is kept as default.
       while (i<a.length() || i<b.length() || carry!=0){
           int x=0;
           if(i<a.length() && a.charAt(a.length()-i-1)=='1'){
               x=1;
           }
           int y=0;
           if(i<b.length() && b.charAt(b.length()-i-1)=='1'){
               y=1;
           }
           ans=(((x+y+carry)%2) + ans).toString();
           carry=(x+y+carry)/2;
           i+=1;
       }
      return ans;
    }
}
