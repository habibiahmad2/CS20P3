package mastery;

import java.util.Scanner;

public class Excersise2 {

    public static void main(String[] args) {
        // make a Scanner for input
        Scanner input = new Scanner(System.in);

        // costs
        double labor = 0.75;
        double rent = 1.00;
        double material; 
        double diameter;
        double total;

        // ask user for diameter
        System.out.print("Enter the diameter of the pizza in inches: ");
        diameter = input.nextDouble();

        // calculate material cost
        material = 0.05 * diameter * diameter;

        // add up total cost
        total = labor + rent + material;

        // show result
        System.out.println("The cost of making the pizza is : $" + total);
    }
}
