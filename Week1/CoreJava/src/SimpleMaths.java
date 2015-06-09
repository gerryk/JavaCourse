/**
 * 
 */

/**
 * @author egerkav
 *
 */
public class SimpleMaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Some simple maths 
		double a = 100;
		double b = 78;
		double c = 11111;
		double d = 3;
		byte x;
		int y;
		
		System.out.println("a + b = " + a+b);
		System.out.println("d - c = " + (d-c));
		System.out.println("b / d = " + b/d);
		System.out.println("a % d = " + a%d);

		System.out.println("Average of a,b,c,d = " + ((a+b+c+d)/4));
		
		System.out.println("(a+b) / (c-d) = " + ((a+b)/(c-d)));
		x = 10;
		y = x;
		System.out.println("byte -> int: y = " + y);
		
		y = 1000;
		x = (byte)y;
		System.out.println("int -> byte: x = " + x);
	}

}
