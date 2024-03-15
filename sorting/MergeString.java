import java.util.*;

public class MergeString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        String result = mergeString(word1, word2);
        System.out.println("Result: "+result);
    }

    private static String mergeString(String word1, String word2){
        StringBuilder result = new StringBuilder();

        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        while(i< word1.length()){
            result.append(word1.charAt(i++));
        }

        while(j<word2.length()){
            result.append(word2.charAt(j++));
        }

    return result.toString();
    }
}

/*
word1 - lavita
word2 - carolyn
Result: lcaavriotlayn

https://leetcode.com/problems/merge-strings-alternately/description/
*/