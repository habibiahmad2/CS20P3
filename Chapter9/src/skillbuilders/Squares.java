package skillbuilders;
public class Squares
{
	public static void main(String[] args)
	{
		int[] indexSquares = new int[10];
		
		//Storing the values
		for(int i=0; i < indexSquares.length; i++)
		{
			indexSquares[i] = i * i;
		}
		
		//Displaying the value
		for(int i=0; i < indexSquares.length; i++)
		{
			System.out.println(indexSquares[i]);
		}
		
	}
}




