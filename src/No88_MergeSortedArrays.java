import java.util.Arrays;


public class No88_MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};
        int m=3; //length of arr1
        int n=3; //length of arr2
        MergeSortedlist2(arr1,m,arr2,n);
    }
    static void MergeSortedlist2(int[] nums1,int m,int[] nums2,int n){
        //this will start filling the array from the end
        int i = 0,j=0,k=0;
        while (m>0 && n>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[m+n-1]=nums1[m-1];
                m--;
            }
            else {
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
        }//this FInishes the comparison process
        while (n>0){
            nums1[m+n-1]=nums2[n-1];
            n--;
        }//this fills up the rest of the array
        }
    }

