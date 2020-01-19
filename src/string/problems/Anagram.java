package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static boolean isAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }
        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();
        char[] str1c = word1.toCharArray();
        Arrays.sort(str1c);
        char[] str2c = word2.toCharArray();
        Arrays.sort(str2c);
        return Arrays.equals(str1c, str2c);
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String word1 = "abc";
        String word2 = "cbA";

        if (word1.length() == word2.length()) {

            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();

            char[] str1c = word1.toCharArray();
            Arrays.sort(str1c);

            char[] str2c = word2.toCharArray();
            Arrays.sort(str2c);

            if (Arrays.equals(str1c, str2c)) {
                System.out.println("words are an anagram");
            }
        } else {
            System.out.println("not anagram");
        }
    }
}
