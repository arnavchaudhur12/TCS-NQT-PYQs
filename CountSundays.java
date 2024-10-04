import java.util.Scanner;

public class CountSundays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the starting day of the month
        System.out.println("Enter the start day of the month (sun, mon, tue, wed, thu, fri, sat):");
        String startDay = sc.next().toLowerCase();

        // Input the number of days in the month
        System.out.println("Enter the number of days from the start of the month:");
        int days = sc.nextInt();

        // Array to map days to numbers (0: Sunday, 1: Monday, ..., 6: Saturday)
        String[] daysOfWeek = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};

        // Find the index of the starting day
        int startIndex = 0;
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equals(startDay)) {
                startIndex = i;
                break;
            }
        }

        // Calculate the number of days to the first Sunday
        int daysToFirstSunday = (7 - startIndex) % 7;

        // Count how many Sundays fall within the given number of days
        int numberOfSundays = 0;
        if (days >= daysToFirstSunday) {
            numberOfSundays = 1 + (days - daysToFirstSunday) / 7;
        }

        // Output the result
        System.out.println("Number of Sundays within " + days + " days: " + numberOfSundays);
    }
}
