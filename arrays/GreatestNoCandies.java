// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

import java.util.*;

public class GreatestNoCandies{
    public static void main(String args[]){
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        List<Boolean> result1 = kidsWithCandies(candies1, extraCandies1);
        System.out.println(result1); // Output: [true, true, true, false, true]

        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        List<Boolean> result2 = kidsWithCandies(candies2, extraCandies2);
        System.out.println(result2); // Output: [true, false, false, false, false]
        
        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        List<Boolean> result3 = kidsWithCandies(candies3, extraCandies3);
        System.out.println(result3); // Output: [true, false, true]
    }

    private static List<Boolean> kidsWithCandies(int[]candies, int extraCandies){
        int max = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();

        for (int candy: candies){
            max = Math.max(max , candy);
            // System.out.println("****max***"+max);
        }

        for(int candy: candies){
            result.add(candy+extraCandies >= max);
            // System.out.println("****result***"+result);
        }
        return result;
    }
}

/* Calculate the maximum value in the candies array, then comapre the sum of each candy and extra candies with the max calculated to get the 
result(list<Boolean>).*/