/*

Program: Exercise1.java          Last Date of this Revision: 12/11/2025

Purpose: Create an EvensAndOdds application that generates 25 random integers between 0 and 99 and then
displays all the evens on one line and all the odds on the next line. Application output should look
similar to:

Author: Ahmad Shams, 
School: CHHS
Course: Computer Programming ??
 

*/

package mastery;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {

        Random rand = new Random();

        // arrays to store numbers
        int[] numbers = new int[25];

        // strings to hold even and odd numbers for printing
        String evens = "Even: ";
        String odds = "Odd: ";

        // generate the 25 random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // 0 to 99

            // check if even or odd
            if (numbers[i] % 2 == 0) {
                evens += numbers[i] + " ";
            } else {
                odds += numbers[i] + " ";
            }
        }

        // output
        System.out.println(odds);
        System.out.println(evens);
    }
}


/* Screen Dump
 
Odd: 33 29 35 77 41 61 23 19 49 81 67 91 99 71 95 
Even: 12 98 32 96 2 42 92 46 98 86 

 
 */
