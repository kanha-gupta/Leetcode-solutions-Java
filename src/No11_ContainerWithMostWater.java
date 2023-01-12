public class No11_ContainerWithMostWater {

    //width is difference of the 2 array line(value)
    //width=right-left

    // we will use Math.min to get area so that water doesnt spill

    public int maxArea(int[] height) {
       int maxArea=0;
       int left=0;
       int right= height.length-1;
       while (left<right){
           int width=right-left;
           int area= Math.min(height[left],height[right])* width;
           maxArea=Math.max(maxArea,area); //store the biggest area calculated.

           //we will move the pointer which is smaller between left and right to get max width
           if(height[left]< height[right]){
               left++;
           } else if (height[left]> height[right]) {
               right--;
           }
           else{
               left++;
               right--;
           }
       }
       return maxArea;
    }
}
