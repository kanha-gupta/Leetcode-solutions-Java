public class No48_RotateImage {
    //we divide in it 2 parts, transpose & reflect
    public void rotate(int[][] matrix) {
    }
    public void transpose(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j <matrix.length ; j++) {
                int temp=matrix[i][j];
                matrix[j][i]= matrix[i][j];
                matrix[i][j]= temp;
            }
        }
    }
    public void reflect(int[][] matrix){
        for (int i = 0; i < ; i++) {
            
        }
    }
}
