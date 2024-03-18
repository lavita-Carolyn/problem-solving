// https://leetcode.com/problems/decode-xored-array/

import java.util.*;

public class DecodeXORArray{
    public static void main(String args[]){
         int[] encoded1 = {1, 2, 3};
        int first1 = 1;
        int[] result1 = decode(encoded1, first1);
        printArray(result1); // Output: [1, 0, 2, 1]
        
        // int[] encoded2 = {6, 2, 7, 3};
        // int first2 = 4;
        // int[] result2 = decode(encoded2, first2);
        // printArray(result2); // Output: [4, 2, 0, 7, 4]
    }

     private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static int[] decode(int[] encoded, int first){
        int n = encoded.length + 1;
        int[] arr = new int[n];
        arr[0] = first;

        for(int i=1; i<n; i++){
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }
}