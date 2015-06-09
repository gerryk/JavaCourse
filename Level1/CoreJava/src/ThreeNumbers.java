import java.util.Scanner;


public class ThreeNumbers {

	public static void main(String[] args) {
		int temp, first = 0, second = 0, third = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number.");
		String input = scanner.nextLine();
		first = Integer.parseInt(input);
		System.out.println("Enter another number.");
		input = scanner.nextLine();
		temp = Integer.parseInt(input);
		if (temp < first)	{
			second = first;
			first = temp;
			
		} else	{
			second = temp;
		}
		System.out.println("Enter a third number.");
		input = scanner.nextLine();
		temp = Integer.parseInt(input);
		if (temp < first)	{
			third = second;
			second = first;
			first = temp;
		} else if (temp >= second)	{
			third = temp;
		} else if (temp < second)	{
			third = second;
			second = temp;
		} 
		System.out.println("Values in order are: " + first + " " + second + " " + third);
	}
}
