/**
 * Week 6 Assignment M3 - Employee Profile Creation (constructor chaining with this(...))
 */
public class A3_EmployeeProfileCreation {

    static class Employee {
        String empId;
        String empName;
        double salary;
        boolean isIntern;

        // Permanent employee
        public Employee(String empId, String empName, double salary) {
            this.empId = empId;
            this.empName = empName;
            this.salary = salary;
            this.isIntern = false;
        }

        // Intern: chain to the 3-argument constructor with salary 0, then mark as intern
        public Employee(String empId, String empName) {
            this(empId, empName, 0);
            this.isIntern = true;
        }

        void printProfile() {
            System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
        }
    }

    public static void main(String[] args) {
        Employee permanent = new Employee("E-101", "Divya", 65000);
        Employee intern = new Employee("E-102", "Arjun");
        permanent.printProfile();
        intern.printProfile();
    }
}
