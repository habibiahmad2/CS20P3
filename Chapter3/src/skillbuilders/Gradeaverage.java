package skillbuilders;

import java.util.Scanner;

public class Gradeaverage {

    public static void main(String[] args) 
    {
        // Declaration
        int grade1, grade2, grade3, grade4, grade5;
        int sum;
        double average;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input grades
        System.out.print("Enter grade 1: ");
        grade1 = input.nextInt();

        System.out.print("Enter grade 2: ");
        grade2 = input.nextInt();

        System.out.print("Enter grade 3: ");
        grade3 = input.nextInt();

        System.out.print("Enter grade 4: ");
        grade4 = input.nextInt();

        System.out.print("Enter grade 5: ");
        grade5 = input.nextInt();

        // Process (sum grades and calculate average using += operator)
        sum = 0;
        sum += grade1;
        sum += grade2;
        sum += grade3;
        sum += grade4;
        sum += grade5;

        average = sum / 5.0;

        // Output
        System.out.println("The average grade is: " + average + "%");
    }
}
