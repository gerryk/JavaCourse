
public class Rectangle extends Shape {
	protected double x, y, height, width;
	public Rectangle(double x, double y, double height, double width) {
		super();
		this.x = y;
		this.y = y;
		this.height = height;
		this.width = width;
		this.bgColour = "black";
		this.fgColour = "white";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.printf("Drawing Rectangle at %f, %f%n", (float)this.x, (float)this.y);
	}
	@Override
	public  String toString() {
		// TODO Auto-generated method stub
		return String.format("Rectangle%nHeight %f Width %f at %f, %f%n",
								(float)this.height, (float)this.width,
								(float)this.x, (float)this.y);
	}
}
