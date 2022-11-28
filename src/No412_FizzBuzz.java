import java.util.ArrayList;
import java.util.List;

public class No412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result=new ArrayList<>();
        int i=1;
        while (i<=n){
            if(i%3==0 || i%5==0 || i%3==0 && i%5==0){
                if(i%3==0 && i%5==0){
                    result.add("FizzBuzz");
                    i++;
                }
                if(i%3==0){
                    result.add("Fizz");
                    i++;
                }
                if(i%5==0){
                    result.add("Buzz");
                    i++;
                }
            }
            else{
                result.add(Integer.toString(i));
                i++;
            }
        }
        return result;
    }
}
