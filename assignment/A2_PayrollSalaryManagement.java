/**
 * Week 6 Assignment M2 - Payroll Salary Management (encapsulation)
 */
public class A2_PayrollSalaryManagement {

    static class PayrollAccount {
        private double basicSalary;
        private double bonus;

        public PayrollAccount(double openingBasicSalary) {
            if (openingBasicSalary < 0) {
                System.out.println("Warning: basic salary cannot be negative. Starting at 0.");
                this.basicSalary = 0;
            } else {
                this.basicSalary = openingBasicSalary;
            }
        }

        public void creditBonus(double amount) {
            if (amount <= 0) {
                System.out.println("Bonus rejected: amount must be greater than 0");
                return;
            }
            bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }

        public void deductTax(double percent) {
            if (percent < 0 || percent > 100) {
                System.out.println("Tax rejected: percent must be between 0 and 100");
                return;
            }
            basicSalary -= basicSalary * percent / 100;
            System.out.println("Tax deducted: " + formatPercent(percent) + "%");
        }

        public double getNetSalary() {
            return basicSalary + bonus;
        }

        private static String formatPercent(double percent) {
            return percent == Math.floor(percent) ? String.valueOf((long) percent) : String.valueOf(percent);
        }
    }

    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}
