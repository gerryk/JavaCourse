package errors;

public class Driver {

	public static void main(String[] args) {
		float x = 20, y = 0;
		float a = 10, b = 10;
		Calculator calc = new Calculator();
		try	{
			System.out.printf("%f + %f = %f\n", x, y, calc.add(x,y));
			System.out.printf("%f - %f = %f\n", x, y, calc.subtract(a,b));
			System.out.printf("%f / %f = %f\n", x, y, calc.divide(x,y));
			System.out.printf("%f * %f = %f\n", x, y, calc.multiply(x,y));
		} 
		catch (CalculatorException e)	{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (CalculatorDivideByZeroException e)	{
			System.out.println("Runtime");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e)	{
			System.out.println("Generic exception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
