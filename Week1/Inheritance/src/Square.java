
public class Square extends Rectangle {

	public Square(int x, int y, int side) {
		super(x, y, side, side);
	}

	public void draw()	{
		System.out.println("Drawing square");
	}
	
	public String toString()	{
		return String.format("I am a SQUARE of side %d.\nI am located at X=%d and Y=%d\nMy area is %f\n\n",
				this.height, this.x, this.y, this.getArea());
	}
}
