import java.util.HashSet;
import java.util.Set;

public class No73_SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
    int row=matrix.length;
    int column=matrix[0].length;
    Set<Integer> rows=new HashSet<>();
    Set<Integer> cols=new HashSet<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(rows.contains(i)|| cols.contains(j)){
                    //OR is used so as to make its relating rows & column zero
                    matrix[i][j]=0;
                }
            }
        }
    }
}
