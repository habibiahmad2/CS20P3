package skillbuilders;

import java.util.Scanner;

public class Exponentiation {

    // This method returns base^exponent using a simple loop
    public static int powerOf(int base, int exponent) {

        int result = 1;  // start with 1 because anything to power 0 = 1

        for (int i = 1; i <= exponent; i++) {
            result = result * base;   // multiply base each time
        }

        return result; // send the answer back
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        // Call the method that calculates base^exponent
        int answer = powerOf(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " = " + answer);

        input.close();
    }
}
