
public class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius)	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public Circle(int radius)	{
		this(10,10,radius);
	}
	
	public Circle()	{
		this(10,10,10);
	}
	
	public String toString()	{
		String result = this.x + ", " + this.y + ", " + this.radius;
		return result;
	}
}
