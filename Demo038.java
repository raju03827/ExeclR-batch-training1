import java.util.Scanner;

public class Demo038 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);
            
            if (Character.isUpperCase(ch)) {
                System.out.println("The character is uppercase.");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("The character is lowercase.");
            } else {
                System.out.println("The character is neither uppercase nor lowercase.");
            }
        }
    }
}