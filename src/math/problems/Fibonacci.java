package math.problems;

import java.util.ArrayList;
import java.util.Iterator;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

         int a = 0;
         int b = 1;
         int arr[] = new int[40];
         arr[0]=a;
         arr[1]=b;

         for(int i = 2; i <40; i++){
             int temp = 0;
             arr[i] = arr[i-2] + arr[i-1];
         }

         int x = 0;
         while (x <39){
             x++;
             System.out.println(arr[x]);
         }




    }
}
