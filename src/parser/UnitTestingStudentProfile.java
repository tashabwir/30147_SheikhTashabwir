package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.


        try {
            Student student = new Student();
            Assert.assertEquals("Idrahim", "Ibrahim");
            System.out.println("Student Idrahim found");

        } catch (AssertionError x) {
            System.out.println("student Idrahim not found");
        }

        try {
            Student student = new Student();
            Assert.assertEquals("Apurba", "Apurba");
            System.out.println("Student Apurba found");

        } catch (AssertionError x) {
            System.out.println("student Apurba not found");
        }

    }
}
