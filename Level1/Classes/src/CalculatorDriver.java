
public class CalculatorDriver {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		// ints
		System.out.printf("%d + %d = %d%n", 5, 5, c.add(5,  5));
		System.out.printf("%d - %d = %d%n", 7, 5, c.subtract(7,  5));
		System.out.printf("%d / %d = %d%n", 10, 5, c.divide(10,  5));
		System.out.printf("%d * %d = %d%n", 5, 5, c.multiply(5,  5));
		// floats
		System.out.printf("%f + %f = %f%n", 5.0, 5.0, c.add((float)5.0, (float)5.0));
		System.out.printf("%f - %f = %f%n", 7.6, 5.0, c.subtract((float)7.6,  (float)5.0));
		System.out.printf("%f / %f = %f%n", 10.0, 5.0, c.divide((float)10.0, (float)5.0));
		System.out.printf("%f * %f = %f%n", 5.0, 5.2, c.multiply((float)5.0, (float)5.2));	
	}
}
