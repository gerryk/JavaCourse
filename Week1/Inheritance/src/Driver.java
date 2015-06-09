
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape [] shapes = new Shape[5];
		shapes[0] = new Circle(3,3,6);
		shapes[1] = new Square(3,3,8);
		shapes[2] = new Square(1,1,6);
		shapes[3] = new Circle(1,1,10);
		shapes[4] = new Circle(10,10,13);
		for (Shape shape: shapes)	
			System.out.println(shape.getArea());
		
		for (Shape shape: shapes)
			shape.draw();
		
		for (Shape shape: shapes)
			System.out.print(shape);
	}
}
