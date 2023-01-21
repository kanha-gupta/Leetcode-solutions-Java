public class No56_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int[][] result=new int[intervals.length][intervals[0].length];
        for (int i = 0; i<intervals.length ; i++) {
            for (int j = 0; j <intervals[0].length; j++) {
               result[i][j]=intervals[i][j];
               if(intervals[i][j]< intervals[i][j+1] ||
                       intervals[i][j]<intervals[i+1][j-1]);
                {
                }
            }
        }
    }
}
