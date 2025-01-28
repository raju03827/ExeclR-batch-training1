
   import java.util.Scanner;
public class Demo018 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        long totalMinutes = scanner.nextLong();
        
        // Constants for time calculations
        long minutesInAnHour = 60;
        long hoursInADay = 24;
        long daysInAYear = 365;
        
        long minutesInADay = minutesInAnHour * hoursInADay; // 1440 minutes in a day
        long minutesInAYear = minutesInADay * daysInAYear; // 525600 minutes in a year
        
        // Calculate years, days, and remaining minutes
        long years = totalMinutes / minutesInAYear;
        long remainingMinutesAfterYears = totalMinutes % minutesInAYear;
        long days = remainingMinutesAfterYears / minutesInADay;
        long remainingMinutes = remainingMinutesAfterYears % minutesInADay;
        
        // Display the result
        System.out.println(totalMinutes + " minutes is approximately " + years + " years, " + days + " days, and " + remainingMinutes + " minutes.");
        
        scanner.close();
    }
}

