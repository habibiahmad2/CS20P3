package mastery;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get package weight
        System.out.print("Enter package weight in kilograms: ");
        double weight = input.nextDouble();

        // Get package size
        System.out.print("Enter package length in centimeters: ");
        double length = input.nextDouble();

        System.out.print("Enter package width in centimeters: ");
        double width = input.nextDouble();

        System.out.print("Enter package height in centimeters: ");
        double height = input.nextDouble();

        // Find the total size (volume)
        double size = length * width * height;

        // Check if package is too heavy or too large
        if (weight > 27 && size > 100000) {
            System.out.println("Too heavy and too large!");
        } else if (weight > 27) {
            System.out.println("Too heavy!");
        } else if (size > 100000) {
            System.out.println("Too large!");
        } else {
            System.out.println("Package is accepted!");
        }
    }
}
