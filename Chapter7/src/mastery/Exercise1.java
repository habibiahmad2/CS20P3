package mastery;
import java.util.Scanner;
public class Exercise1
{
   private int pennies;
   private int nickels;
   private int dimes;
   private int quarters;
   // constructor
   public Exercise1() {
       pennies = 0;
       nickels = 0;
       dimes = 0;
       quarters = 0;
   }
   // methods that add coins
   public void addPenny() {
       pennies = pennies + 1;
   }
   public void addNickel() {
       nickels = nickels + 1;
   }
   public void addDime() {
       dimes = dimes + 1;
   }
   public void addQuarter() {
       quarters = quarters + 1;
   }
   // remove all money (empty the piggy bank)
   public void takeMoneyOut() {
       pennies = 0;
       nickels = 0;
       dimes = 0;
       quarters = 0;
   }
   // return total money in dollars
   public double getTotal() {
       return pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
   }
}
