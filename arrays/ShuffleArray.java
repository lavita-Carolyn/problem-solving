// https://leetcode.com/problems/shuffle-the-array

import java.util.*;

public class ShuffleArray{
    public static void main(String args[]){
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] ans = shuffle(nums, n);
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];

        for(int i=0,j=0;i<n;i++,j+=2){
            ans[j] = nums[i];
            ans[j+1] = nums[i+n];
        }
        return ans;
    }
}