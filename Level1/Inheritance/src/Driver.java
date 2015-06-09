
public class Driver {

	public static void main(String[] args) {
		Shape [] s = new Shape[4];
		s[0] = new Square(10,10,23);
		s[1] = new Rectangle(3.4,5.6,23,17);
		s[2] = new Circle(15,13.5,10);
		s[3] = new Square(20,4,16);
		for (Shape i : s)	{
			i.draw();
		}
	}

}
