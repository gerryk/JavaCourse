
public class Circle extends Shape {
	private double x, y, radius;
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public void draw() {
		System.out.printf("Drawing Circle at %f, %f%n", (float)this.x, (float)this.y);
	}
	@Override
	public  String toString() {
		return String.format("Circle%nRadius %f at %f, %f%n",
								(float)this.radius,
								(float)this.x, (float)this.y);
	}

}
