import java.util.Scanner;
public class Iteration {

	public static void main(String[] args) {
		// illustrate some examples of the iteration types
		int val1 = 0, val2 = 0;
		Scanner sc = new Scanner(System.in);
		do	{
			System.out.println("Enter an integer value from 1 to 100 (minimum)");
			String input = sc.nextLine();
			val1 = Integer.parseInt(input);
		} while (val1 < 0 || val1 > 100);
		do	{
			System.out.println("Enter a second integer value from " + val1 + " to 100 (maximum)");
			String input = sc.nextLine();
			val2 = Integer.parseInt(input);
		} while (val2 <= val1 || val2 > 100);
		for (int count = val1; count <= val2; count++)	{
			System.out.println(count);
		}
		for (int count = val1; count <= val2; count++)	{
			if(count%2 == 1)
				System.out.println(count);
		}
		sc.close();
	}
}
