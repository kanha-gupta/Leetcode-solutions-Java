import java.util.Arrays;

public class No1886_FindRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean p=true,q=true,r=true,s=true;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=target[i][j]){
                    p=false;
                }
                if(mat[i][j]!=target[mat.length-j-1][i]){
                    q=false;
                }
                if(mat[i][j]!=target[mat.length-1-i][mat.length-1-j]){
                    r=false;
                }
                if(mat[i][j]!=target[j][mat.length-1-i])
                {s=false;
                }
            }
        }

        return p|q|r|s;
        //Using or gate so that if any one of them is true, it means that it is rotatable & equals to input matrix
    }
}
