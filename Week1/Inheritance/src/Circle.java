
public class Circle extends Shape {
	int x, y, radius;

	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.background = "Black";
		this.foreground = "White";
	}

	public float getArea()	{
		float area = (float)Math.PI * (float)(this.radius ^2);
		return area;
	}
	
	public void draw()	{
		System.out.println("Drawing circle");
	}
	
	public String toString()	{
		return String.format("I am a CIRCLE of radius %d.\nI am located at X=%d and Y=%d\nMy area is %f\n\n", 
				this.radius, this.x, this.y, this.getArea());
	}
}
