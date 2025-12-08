package skillbuilders;
public class Rectangle
{
	private double length, width;
	
	public Rectangle() //Default Constructor method
	{
		length = 1;
		width = 1;		
	}
	
	//Overloading the default constructor method
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	//Modifier methods start with set
	public void setLength(double newL)
	{
		length = newL;
	}
	
	public void setWidth(double newW)
	{
		width = newW;
	}
	
	//Accessor methods start with get
	public double getLength()
	{
		return length;
		
	}
	
	public double getWidth()
	{
		return width;
		
	}
	
	public String toString()
	{
		String rectangleString;
		rectangleString = "Rectangle has length " + length + " and width " + width;
	 	return(rectangleString);
	}
	
	
	public double area()
	{
		double rectArea;
		
		rectArea = length * width;
		
		return rectArea;
	}
	
	public boolean equals(Object r)
	{
		Rectangle testObj = (Rectangle)r;
		
		if(testObj.getLength() == length && testObj.getWidth() == width)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public int compareTo(Object r)
	{
		Rectangle testObj = (Rectangle)r;
		
		if(length < testObj.getLength() || width < testObj.getWidth())
		{
			return(-1);
		}
		else if(length == testObj.getLength() || width == testObj.getWidth())
		{
			return(0);
		}
		else
		{
			return(1);
		}
	}
}


