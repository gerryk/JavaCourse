
public class Circle {
	int x, y, r;
	public Circle(int x, int y, int r)	{
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public Circle(int r)	{
		this(10,10,r);
	}
	public Circle()	{
		this(10,10,10);
	}
	public String toString()	{
		return "X: " + x + " Y: " + y + " R: " + r;
	}
}
