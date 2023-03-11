public class No4_medianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //merge both arrays then return median using formula

        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        //below while loops fill extras if any
        while (i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }
        //return median
        if (merged.length % 2 == 0) {
            return (merged[merged.length / 2] + merged[(merged.length / 2) - 1]) / 2.0;
        } else {
            return merged[merged.length / 2];
        }
    }
}
