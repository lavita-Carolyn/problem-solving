//https://leetcode.com/problems/concatenation-of-array

import java.util.*;

public class ConcatOfArray{
    public static void main(String args[]){
        int[] nums = {5,0,1,2,3,4};

        int[] ans = concat(nums);
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static int[] concat(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}