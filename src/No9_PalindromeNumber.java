public class No9_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(43));
    }
    static boolean isPalindrome(int x){
        //this code reverses the digits & compares with input number
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
