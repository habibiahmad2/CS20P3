package skillbuilders;
import java.util.Scanner;
public class StudentRoster
{
	public static void main(String[] args)
	{
		String[] studentNames;
		
		int numNames;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students? ");
		numNames = input.nextInt();
		
		studentNames = new String[numNames];
		
		//get the student names from the user
		for(int i = 0; i < numNames; i++)
		{
			System.out.println("Enter student name: ");
			studentNames[i] = input.next();
		}
		
		//Display the names in the array
		System.out.println("\nStudent Roster");
		for(int i = 0; i < numNames; i++)
		{
			System.out.println(studentNames[i]);
			
		}
		}
	
}
