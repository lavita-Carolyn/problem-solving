/*To find the total no. of connects we create a set of array B and check is this contains the compliment of elements in array A */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class XOR {
    public static int countConnects(int[] A, int[] B) {
        // Create a set to store elements of array B
        Set<Integer> setB = new HashSet<>();
        for (int num : B) {
            setB.add(num);
        }

        // Initialize count of connects
        int connects = 0;

        // Iterate through elements of array A
        for (int num : A) {
            // Check if the complement of num exists in setB
            if (setB.contains(num ^ 0)) {
                // If yes, increment the count of connects
                connects++;
            }
        }

        return connects;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {1,2,3,4,5};
        System.out.println("Total connects: " + countConnects(A, B));
    
    }
}
