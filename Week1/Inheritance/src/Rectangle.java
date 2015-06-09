public class Rectangle extends Shape {
	int length, height;
	int x, y;

	public Rectangle(int x, int y, int length, int height) {
		super();
		this.x = x;
		this.y = y;
		this.length = length;
		this.height = height;
		this.background = "Black";
		this.foreground = "White";
	}

	public float getArea()	{
		float area = (float)length * height;
		return area;
	}
	
	public void draw()	{
		System.out.println("Drawing rectangle");
	}
}
