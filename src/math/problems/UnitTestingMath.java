package math.problems;

import org.testng.Assert;

import static math.problems.FindMissingNumber.getMissingNumber;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        try {
            int [] array = new int[]{2, 1, 4, 5};
            Assert.assertEquals(getMissingNumber(array, 4), 3);
            System.out.println("Unit testing passed");
        }catch (AssertionError ar){
            System.out.println("Unit testing failed");
        }

        try {
            Assert.assertEquals(Factorial.factorial(4), 6);
            System.out.println("Unit testing passed");
        }catch (AssertionError ar){
            System.out.println("Unit testing failed");
        }
    }
}
