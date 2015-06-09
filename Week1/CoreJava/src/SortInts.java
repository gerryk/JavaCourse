import java.util.Scanner;
public class SortInts {

	public static void main(String[] args) {
		int inputVal, first, second, third;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		String input = sc.nextLine();
		inputVal = Integer.parseInt(input);
		first = inputVal;
		System.out.println("Enter another integer");
		input = sc.nextLine();
		inputVal = Integer.parseInt(input);
		if (inputVal < first)	{
			second = first;
			first = inputVal;
		} else	{
			second = inputVal;
		}
		System.out.println("Enter another integer");
		input = sc.nextLine();
		inputVal = Integer.parseInt(input);
		if (inputVal > first)	{
			if (inputVal < second)	{
				third = second;
				second = inputVal;
			} else	{
				third = inputVal;
			} 
		} else	{
			third = second;
			second = first;
			first = inputVal;
		}
		// System.out.println( first + " " + second + " " + third);
		System.out.printf( "%d %d %d", first, second, third);
	}
}
