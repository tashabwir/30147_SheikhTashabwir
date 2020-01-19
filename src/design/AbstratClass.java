package design;

public abstract class AbstratClass implements Employee {

    final static String companyName = "Apex";

    public static double calculateSalary(int salary, double bonus) {
        return salary + bonus;
    }

    public static void performance (){
        System.out.println("Performance is measured with the employees corresponding rating.");
    }

    public void performance (String rating) {
        System.out.println("The employee's performance is rated :" + rating);
    }


}
