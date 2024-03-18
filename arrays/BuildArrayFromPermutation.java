import java.util.*;

public class BuildArrayFromPermutation {
    public static void main(String args[]){

        int[] nums = {5,0,1,2,3,4};

        int[] ans = buildArray(nums);
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
    private static int[] buildArray(int[] nums){
        int n = nums.length;

        int[] ans = new int[n];

        for(int i= 0; i<n; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

//https://leetcode.com/problems/build-array-from-permutation/description/

