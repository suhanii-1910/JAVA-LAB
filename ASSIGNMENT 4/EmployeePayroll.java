// 2. Develop an Employee Payroll System that accepts employee IDs, basic salary, and
// bonus amounts from the user. Convert the entered values into wrapper objects and perform
// validation operations to ensure valid salary values before calculating the net salary.
public class EmployeePayroll {

    public static void main(String[] args) {

        String empId = "101";
        String salary = "50000";
        String bonus = "5000";

        Integer id = Integer.valueOf(empId);
        Double basicSalary = Double.valueOf(salary);
        Double bonusAmount = Double.valueOf(bonus);

        if (basicSalary > 0) {

            double netSalary = basicSalary + bonusAmount;

            System.out.println("Employee ID = " + id);
            System.out.println("Basic Salary = " + basicSalary);
            System.out.println("Bonus = " + bonusAmount);
            System.out.println("Net Salary = " + netSalary);

        } else {

            System.out.println("Invalid Salary");
        }
    }
}