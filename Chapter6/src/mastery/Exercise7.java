/*

Program: Exercise7.java          Last Date of this Revision: 11/17/2025

Purpose: Create a PerfectIntegers application that displays all perfect integers up 
to 100. A perfect integer is a number which is equal to the sum of all its factors
 except itself. For example, 6 is a perfect number because 1 + 2 + 3 = 6.
The application should include a boolean method isPerfect().

Author: Ahmad Shams 
School: CHHS
Course: Computer Programming ??
 

*/
package mastery;

public class Exercise7 {

    // This method checks if a number is perfect
    public static boolean isPerfect(int number) {

        int sum = 0; // this will hold the sum of the factors

        // find all factors except the number itself
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // if i divides the number evenly
                sum += i;          // add i to the sum
            }
        }

        // a number is perfect if sum of its factors equals the number
        return sum == number;
    }

    public static void main(String[] args) {

        System.out.println("Perfect numbers up to 100:");

        for (int n = 1; n <= 100; n++) {
            if (isPerfect(n)) {
                System.out.println(n);
            }
        }
    }
}


/* Screen Dump
 
Perfect numbers up to 100:
6
28


 
 */
