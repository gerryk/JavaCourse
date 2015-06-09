
public class Square extends Rectangle {
	public Square(double x, double y, double side) {
		// TODO Auto-generated constructor stub
		super(x, y, side, side);
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.printf("Drawing Square at %f, %f%n", (float)this.x, (float)this.y);
	}
	@Override
	public  String toString() {
		// TODO Auto-generated method stub
		return String.format("Square%nSide %f at %f, %f%n",
								(float)this.height, 
								(float)this.x, (float)this.y);
	}

}
