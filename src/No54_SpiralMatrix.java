import java.util.ArrayList;
import java.util.List;

public class No54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int left=0;
        int right= matrix[0].length-1;
        int top=0;
        int bottom= matrix.length-1;
        int direction=0;
        //we will traverse according to directions specified by the code
        //direction=0, from left to right
        //direction=1, from top to bottom
        //direction=2, from right to left
        //direction=3, from bottom to top
        while (left<=right && top<=bottom){
            if(direction==0){
                for (int i = left; i <=right; i++) {
                    result.add(matrix[top][i]);
                }
                direction=1;
                top++; //increased row

            } else if (direction==1) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                direction=2;
                right--; //decreased column
            } else if (direction==2) {
                for (int i = right; i>=left ; i--) {
                    result.add(matrix[bottom][i]);
                }
                direction=3;
                bottom--; // decreased row
            } else if (direction==3) {
                for (int i = bottom; i >=top ; i--) {
                    result.add(matrix[i][left]);
                }
                direction=0;
                left++; //increased column
            }
        }
        return result;
    }
}
