import java.util.Scanner;

/**
 * 
 */

/**
 * @author egerkav
 *
 */
public class Iteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean ok = true;
		int min =0, max = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100.");
		String input = scanner.nextLine();
		int num1 = Integer.parseInt(input);
		System.out.println("Enter another number between 1 and 100.");
		input = scanner.nextLine();
		int num2 = Integer.parseInt(input);
		if (num1 > 1 && num1 < 100 && num2 > 1 && num2 < 100)	{
			if (num1 < num2) {
				min = num1;
				max = num2;
			} else if (num2 < num1)	{
				min = num2;
				max = num1;
			} else	{
				ok = false;
				System.out.println("Ya numpty... they're the same number!");
			}
			if (ok)	{
				for (int i=min; i <= max; ++i)	{
					System.out.print(i + " ");
				}
				System.out.println();
				for (int i=min; i <= max; ++i)	{
					if (i%2 == 0)	{
						continue;
					}
					System.out.print(i + " ");
				}
				System.out.println();
			}
		} else	{
			System.out.println("Numbers need to be between 1 and 100.");
		}
	}
}
