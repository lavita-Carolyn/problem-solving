/* Q: calculate the number of unique characters in a string using set.

No Duplicates: A set cannot contain duplicate elements. If you attempt to add an element that is already present in the set, the operation will have no effect.

Unordered: The elements in a set do not have a specific order. Unlike lists, sets do not maintain the order of insertion.

Interfaces: Sets are primarily defined by the Set interface in Java. There are several implementations of the Set interface available in the Java Collections Framework, including HashSet, TreeSet, and LinkedHashSet.*/

import java.util.HashSet;
import java.util.Set;

public class CountUniqueCharacters {
    public static void main(String[] args) {
        String inputString = "hello world"; 

        int uniqueCharactersCount = countUniqueCharacters(inputString);
        System.out.println("Number of unique characters: " + uniqueCharactersCount);
    }

    public static int countUniqueCharacters(String str) {
        Set<Character> uniqueCharacters = new HashSet<>();

        for (char c : str.toCharArray()) {//to count the number of unique characters we use toCharArray() to get each character of a string.
            uniqueCharacters.add(c);
        }

        return uniqueCharacters.size();
    }
}