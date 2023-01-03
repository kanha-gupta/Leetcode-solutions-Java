public class No520_DetectCapital {
    public boolean detectCapitalUse(String word){
        int countUpper=0;
        for (int i = 0; i <word.length() ; i++) {
            char[] ch=word.toCharArray();
            if(Character.isUpperCase(ch[i])){
                countUpper++;
            }
        }
        if(countUpper==word.length() || countUpper==0){
            return true;
        } else if (countUpper==1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        return false;
    }
}
