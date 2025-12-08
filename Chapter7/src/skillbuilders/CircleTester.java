package skillbuilders;
public class CircleTester
{
	public static void main(String[] args)
	{
		Circle c = new Circle(2.5);
		
		Circle c2 = new Circle(7.1);
		
		c.setRadius(7.1);
		
		System.out.println(c.getRadius());
		System.out.println(c.circumference());
		System.out.println(c.area());
		
		System.out.println(c);
		
		if(c.equals(c2))
		{
			System.out.println("c and c2 are equal.");
		}
		else
		{
			System.out.println("c and c2 are not equal.");
		}
			
	}
}






