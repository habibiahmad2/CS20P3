package skillbuilders;

import java.util.Scanner; // read input from the user
import java.util.Random;  // needed for random number generation

public class RandomNumber
{
    public static void main(String[] args)
    {
        // Create Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the minimum and maximum numbers
        System.out.print("Enter the minimum number: ");
        int min = input.nextInt();
        
        System.out.print("Enter the maximum number: ");
        int max = input.nextInt();
        
        // Create Random object
        Random rand = new Random();
        
        // Generate a random integer between min and max (inclusive)
        int randomNumber = rand.nextInt((max - min) + 1) + min;
        
        // Display the random number
        System.out.println("Your random number is: " + randomNumber);
        
        input.close();
    }
}
