/**
 * Week 6 Assignment M5 - Employee and Company Information Management (static members)
 */
public class A5_EmployeeCompanyInfo {

    static class Employee {
        static String companyName = "Bright Horizon Technologies"; // shared by all employees
        static int employeeCount = 0;

        String empName;
        double salary;

        Employee(String empName, double salary) {
            this.empName = empName;
            this.salary = salary;
            employeeCount++;
        }

        // Uses only static fields
        static void printCompanyInfo() {
            System.out.println(companyName);
            System.out.println("Employees on record: " + employeeCount);
        }
    }

    public static void main(String[] args) {
        new Employee("Divya", 65000);
        new Employee("Arjun", 40000);
        new Employee("Meera", 52000);
        Employee.printCompanyInfo(); // called through the class name
    }
}
