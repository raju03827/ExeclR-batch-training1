
import java.util.Scanner;
public class Demo021 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter monthly gross salary: ");
        double monthlyGrossSalary = scanner.nextDouble();
        
        System.out.print("Enter monthly HRA: ");
        double monthlyHRA = scanner.nextDouble();
        
        System.out.print("Enter monthly PF: ");
        double monthlyPF = scanner.nextDouble();
        
        
        double annualSalary = monthlyGrossSalary * 12;
        
        
        double annualHRA = monthlyHRA * 12;
        double annualPF = monthlyPF * 12;
        double deductions = annualHRA + annualPF;
        
        
        double taxableIncome = annualSalary - deductions;
        
        
        double totalTax = 0;

        if (taxableIncome <= 500000) {
            totalTax = taxableIncome * 0.10; // 10% tax
        } else if (taxableIncome <= 1000000) {
            totalTax = (500000 * 0.10) + ((taxableIncome - 500000) * 0.20); // 10% for first 500000 and 20% for the rest
        } else {
            totalTax = (500000 * 0.10) + (500000 * 0.20) + ((taxableIncome - 1000000) * 0.30); // 10% for first 500000, 20% for next 500000, and 30% for the rest
        }
        
        
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Deductions (HRA + PF): " + deductions);
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Total Annual Tax: " + totalTax);
        
        scanner.close();
    }
}

