import java.util.Arrays;
import java.util.Stack;

public class No56_mergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals==null || intervals.length==0) {
            return intervals;
        }
        int m = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0])); //sorts by first element of each array
        Stack<int[]> stack = new Stack<>();
        stack.push(intervals[0]);
        for(int[] interval : intervals) {
            int [] top = stack.peek();
            if (top[1]< interval[0]) {
                stack.push(interval);
            } else if (top[1]< interval[1]) {
                top[1]=interval[1];
                stack.pop();
                stack.push(top);
            }
        }
        return stack.toArray(new int[stack.size()][2]);
    }
}
