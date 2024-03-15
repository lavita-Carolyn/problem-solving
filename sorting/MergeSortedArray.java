import java.util.*;

public class MergeSortedArray{
    public static void main(String args[]){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        
        System.out.println(merge(nums1, m, nums2, n));
    }

    private static String merge(int[] nums1,int m, int[] nums2, int n){
        int p1 = m - 1; // Pointer for nums1
        int p2 = n - 1; // Pointer for nums2
        int p = m + n - 1; // Pointer for merged array

        // Start merging from the end of nums1
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Add any remaining elements from nums2 if there are any
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

        // Convert the merged array to a formatted string
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < nums1.length; i++) {
            sb.append(nums1[i]);
            if (i < nums1.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

/* this program sorts the arrays based on the value of m & n respectively

https://leetcode.com/problems/merge-sorted-array
*/