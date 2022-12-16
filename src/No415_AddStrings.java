import java.math.BigInteger;

public class No415_AddStrings {
    //we have to import java.math.BigInteger on first line to Make biginteger function work
    //needs optimisation
    public String addStrings(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        BigInteger sum=n1.add(n2);
        return sum.toString();
    }
}