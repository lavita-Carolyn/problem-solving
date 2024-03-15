/*This program sorts the strings in the sentence based on the numeric value present at the end of each string in sentence.
https://leetcode.com/problems/sorting-the-sentence */


import java.util.*;

public class SentenceSort {
    public static void main(String args[]){

        // Example 1
        String s1 = "is2 sentence4 This1 a3";
        System.out.println(reconstructOriginalSentence(s1)); // Output: "This is a sentence"

        // Example 2
        String s2 = "Myself2 Me1 I4 and3";
        System.out.println(reconstructOriginalSentence(s2)); // Output: "Me Myself and I"
    

    }

    private static String reconstructOriginalSentence(String s){
        String[] words = s.split(" ");
        Map<Integer, String> wordMap = new HashMap<>();

        for (String word: words){
            int position = Character.getNumericValue(word.charAt(word.length()-1));

            wordMap.put(position, word.substring(0, word.length() - 1));
        }

        StringBuilder sentence = new StringBuilder();
        for(int i=1;i<=wordMap.size();i++){
            sentence.append(wordMap.get(i)).append(" ");
        }
        return sentence.toString().trim();
    }
}