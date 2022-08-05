
//171. Excel Sheet Column Number
public class ESCN_171 {
    public static void main(String[] args) {
        System.out.println(excelsheetcolumnumber("ZA"));
    }
    static int excelsheetcolumnumber(String s){
        int result=0;
        for (int i = 0; i <s.length(); i++) {
            result=result*26;
            result=result+s.charAt(i)-'A'+1;
        }
        return result;
    }
}
