


    import java.util.Scanner;

    public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a multiple of 100
        if (number % 100 == 0) {
            System.out.println(number + " is a multiple of 100.");
        } else {
            System.out.println(number + " is not a multiple of 100.");
        }
    }
}
    

