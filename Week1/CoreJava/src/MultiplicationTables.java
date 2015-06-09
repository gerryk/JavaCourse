
public class MultiplicationTables {

	public static void main(String[] args) {
		// Print multiplication tables from 1 - 10
		String tableline = "";
		for (int i = 1; i <= 10; i++)	{
			for (int j = 1; j <= 12; j++)	{
				tableline +=  i + " x " + j + " = " + (i*j) + " | ";
			}
			System.out.println(tableline);
			tableline = "";
		}
	}
}
