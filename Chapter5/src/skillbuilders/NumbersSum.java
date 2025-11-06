package skillbuilders;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println("The sum is " + sum);
    }
}
