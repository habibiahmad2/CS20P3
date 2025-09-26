package skillbuilders;

import java.util.Scanner;

public class RectPer {

    public static void main(String[] args) 
    {
        // Declaration
        int width;
        int length;
        int perimeter;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input width
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextInt();

        // Input length
        System.out.print("Enter the length of the rectangle: ");
        length = input.nextInt();

        // Process (calculate perimeter)
        perimeter = 2 * width + 2 * length;

        // Output
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
