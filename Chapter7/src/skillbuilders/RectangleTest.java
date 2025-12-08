package skillbuilders;
public class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(4, 5);
		Rectangle r2 = new Rectangle(10, 15);
		
		System.out.println("Rectangle 1 has a length"
							+ r1.getLength()
							+ " and a width of "
							+ r1.getWidth());
		
		System.out.println("Rectangle r1 area is "
						+ r1.area());
		
		if(r1.equals(r2))
		{
			System.out.println("Rectangles are equal");
		}
		else
		{
			System.out.println("Rectangles are not equal");
		}
		
		System.out.println(r1);
		
	}
}








