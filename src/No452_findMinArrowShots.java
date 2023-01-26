import java.util.Arrays;

public class No452_findMinArrowShots {

    public int findMinArrowShots(int[][] points) {
        //we have to sort array in Column-wise method(by their end point)
        Arrays.sort(points, (a,b)->Integer.compare(a[1], b[1]));

        int arrowsCount=1;
        int previous=0;
        for (int current = 1; current <points.length ; current++) {
            if(points[current][0]> points[previous][1]){
                arrowsCount++;
                previous=current;
            }
        }
        return arrowsCount;
    }
}
