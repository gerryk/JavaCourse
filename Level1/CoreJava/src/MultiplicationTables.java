
public class MultiplicationTables {

	public static void main(String[] args) {
		for (int i = 1; i < 11; ++i)	{
			for (int j = 1; j < 13; ++j)	{
				System.out.print(i + " x " + j + " = " + (i*j) + '\t');
			}
			System.out.println();
		}	
	}
}
