package string.problems;

public class Palindrome {

    static void isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                System.out.print("No");

            i++;
            j--;
        }
        System.out.print("Yes");

    }
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String str = "NAYAN";
        isPalindrome(str);

    }
}
