
public class Math {
	public static int add(int... values)	{
		int result = 0;
		for (int value: values)	{
			result += value;
		}
		return result;
	}
	
	public static double add(double... values)	{
		double result = 0.0;
		for (double value: values)	{
			result += value;
		}
		return result;
	}
}
