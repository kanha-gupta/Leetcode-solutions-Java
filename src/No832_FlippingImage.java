public class No832_FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
    //we first reverse each row(reverse the array)
        flipImage(image); //reverse arrays inside image using nested loop
        invertImage(image); //replace 0s with 1s using nested loop
        return image;
        //time complexity O(n*n)
    }
    private void flipImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int n=image[i].length-1;
            int j=0;
            while(j<n){
                int temp=image[i][j];
                image[i][j]=image[i][n];
                image[i][n]=temp;
                j++;
                n--;
            }
        }
    }
    private void invertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
    }

}
