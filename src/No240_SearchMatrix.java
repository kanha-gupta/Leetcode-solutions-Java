public class No240_SearchMatrix {

//    //Brute force, time complexity O(N^2)
//    public boolean searchMatrix(int[][] matrix, int target) {
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[0].length; j++){
//                if(matrix[i][j] == target) return true;
//            }
//        }
//        return false;
//    }

    //optimised, time complexity O(n+m)
    public boolean searchMatrix(int[][] matrix, int target){
        int row=0;
        int col=matrix[0].length-1;

        while (row>=0 && row<matrix.length && col>=0 && col<matrix[0].length){
            if(matrix[row][col]== target){
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            }
        }
        return false;
    }
}
