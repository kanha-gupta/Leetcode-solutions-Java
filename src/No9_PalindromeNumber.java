public class No9_PalindromeNumber {
    public boolean isPalindrome(int x){
        //The number is converted to string especially to check for minus sign. It normally reverses in integer format.
        String str=String.valueOf(x);
        if(str.contains("-"))
            return false;
        boolean flag=true;
        int rev=0;
        int num=x;
        while(x!=0){
            rev=rev*10 + (x%10);
            x/=10;
        }
        if(rev!=num){
            flag=false;
        }
        return flag;
    }
}
