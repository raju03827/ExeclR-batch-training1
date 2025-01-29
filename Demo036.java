import java.util.Scanner;

public class Demo036 {

    public static void main(String[] args) {
        // Take input for three numbers
        try ( // Create a scanner object to get input from user
                Scanner scanner = new Scanner(System.in)) {
            // Take input for three numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();
            // Logic to find the biggest number
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("The biggest number is: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("The biggest number is: " + num2);
            } else {
                System.out.println("The biggest number is: " + num3);
            }
            // Close the scanner to avoid resource leak
        }
    }
}