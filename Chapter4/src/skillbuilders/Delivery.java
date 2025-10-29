package skillbuilders;

import java.util.Scanner;

public class Delivery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for package dimensions
        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.print("Enter height: ");
        int height = input.nextInt();

        // Check if any dimension is greater than 10
        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Rejected");
        } else {
            System.out.println("Accepted");
        }
    }
}
