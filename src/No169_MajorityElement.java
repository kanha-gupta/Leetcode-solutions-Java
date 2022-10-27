import java.util.Arrays;

public class No169_MajorityElement {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,2,3};
        System.out.println(MajorityElement(nums));
    }
    static int MajorityElement(int[] nums){
        Arrays.sort(nums);
        int mid_element=nums.length/2;
        int answer=nums[mid_element];
        return answer;
    }
}

