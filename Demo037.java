import java.util.Scanner;

public class Demo037{

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();
            
            System.out.print("Enter the fourth number: ");
            int num4 = scanner.nextInt();
            
            int biggest = num1;
            
            if (num2 > biggest) {
                biggest = num2;
            }
            if (num3 > biggest) {
                biggest = num3;
            }
            if (num4 > biggest) {
                biggest = num4;
            }
            
            System.out.println("The biggest number is: " + biggest);
        }
    }
}