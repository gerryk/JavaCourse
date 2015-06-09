package errors;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public float add(float x, float y) throws CalculatorException	{
		if (x < -100 || x > 100 || y < -100 || y > 100)
			throw new CalculatorException("Input was out of range...");
		return x + y;
	}
	
	public float subtract(float x, float y) throws CalculatorException	{
		if (x < -100 || x > 100 || y < -100 || y > 100)
			throw new CalculatorException("Input was out of range...");
		return x - y;
	}
	
	public float multiply(float x, float y) throws CalculatorException	{
		if (x < -100 || x > 100 || y < -100 || y > 100)
			throw new CalculatorException("Input was out of range...");
		return x * y;
	}
	
	public float divide(float x, float y) throws CalculatorException, CalculatorDivideByZeroException	{
		if (y == 0)
			throw new CalculatorDivideByZeroException("Divide by zero: Universe explodes");
		if (x < -100 || x > 100 || y < -100 || y > 100)
			throw new CalculatorException("Input was out of range...");
		return x / y;
	}
}
