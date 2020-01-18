package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         */

        int x = 5;
        int total = 1;
        int total2 = 1;
        for( int i = x; i > 1 ; i--){
            total = total * i;
        }
        System.out.println(total);

        total2 = factorial(x);
        System.out.println(total2);

    }
}
