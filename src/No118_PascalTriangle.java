import java.util.ArrayList;
import java.util.List;

public class No118_PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result=new ArrayList<>();
    if(numRows==0) {
        return result;
    }
        for (int i = 0; i <numRows ; i++) {
            List<Integer> row=new ArrayList<>();
            //we create a row which makes necessary calculations then it is inserted into main List result.
            for (int j = 0; j < i+1; j++) {
                if(j==0 || j==i){
                    row.add(1);
                }//this inserts in the first and last position in the row list
                else {
                    row.add(result.get(i-1).get(j-1)+ result.get(i-1).get(j));
                }//this keeps inserting values unless last index of row list hits
            }
            result.add(row);
        }
        return result;
    }

}
