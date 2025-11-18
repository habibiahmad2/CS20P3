package skillbuilders;

import java.util.Scanner;

public class TimeConverter {

    // This method changes hours into minutes
    public static int hoursToMinutes(int hours) {
        return hours * 60;
    }

    // This method changes days into hours
    public static int daysToHours(int days) {
        return days * 24;
    }

    // This method changes minutes into hours
    public static double minutesToHours(int minutes) {
        return minutes / 60.0;
    }

    // This method changes hours into days
    public static double hoursToDays(int hours) {
        return hours / 24.0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("TIME CONVERTER");
        System.out.println("1. Hours → Minutes");
        System.out.println("2. Days → Hours");
        System.out.println("3. Minutes → Hours");
        System.out.println("4. Hours → Days");
        System.out.print("Choose an option (1-4): ");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter hours: ");
            int hours = input.nextInt();
            System.out.println("Minutes: " + hoursToMinutes(hours));
        }

        else if (choice == 2) {
            System.out.print("Enter days: ");
            int days = input.nextInt();
            System.out.println("Hours: " + daysToHours(days));
        }

        else if (choice == 3) {
            System.out.print("Enter minutes: ");
            int minutes = input.nextInt();
            System.out.println("Hours: " + minutesToHours(minutes));
        }

        else if (choice == 4) {
            System.out.print("Enter hours: ");
            int hours = input.nextInt();
            System.out.println("Days: " + hoursToDays(hours));
        }

        else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}
