
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		double result = calc.add(10,20);
		System.out.printf("10 + 20 = %f\n", result);
		result = calc.subtract(10,20);
		System.out.printf("10 - 20 = %f\n", result);
		result = calc.multiply(10,20);
		System.out.printf("10 * 20 = %f\n", result);
		result = calc.divide(26, 4);
		System.out.printf("26 / 5 = %f\n", result);
	}
}
