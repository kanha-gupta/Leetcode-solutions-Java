public class No1572_diagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            sum= mat[i][i] + sum + mat[i][mat.length-i-1];
        } //takes sum of diagonals

        if(mat.length % 2 !=0){
            sum=sum-mat[mat.length/2][mat.length/2];
        } // this code to remove common index from the sum
        //common index occurs when length is odd
        return sum;
    }
}
