package skillbuilders;
public class Reverse
{
	public static void main(String[] args)
	{
		final int NUM_ELEMENTS = 10;
		
		int[] numbers = new int[NUM_ELEMENTS];
		
		//store the number into the array
		
		for(int i = 0; i < NUM_ELEMENTS; i++)
		{
			numbers[i] = i;
		}
		
		//Display countdown
		
		System.out.println("Countdown");
		
		for(int i = NUM_ELEMENTS - 1; i >= 0; i--)
		{
			System.out.println(numbers[i]);
		}
	}
}
