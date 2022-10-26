public class No58_Lengthoflastword {
    public static void main(String[] args) {
        System.out.println(Lengthoflastword("Welcome to my leetcode solutions"));
    }
    static int Lengthoflastword(String s){
        String s1=s.trim();
        int counter=0;
        for (int i = s1.length()-1; i >=0; i--) {
            char c=s1.charAt(i);
            if(c==' '){
                break;
            }
            counter++;
        }
        return counter;
    }
}
