import java.util.Scanner;


public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String input = s.nextLine();
		StringBuilder output = new StringBuilder("");
		for (int i = input.length(); i > 0; --i)	{
			output.append(input.charAt(i-1));
		}
		System.out.printf("%s reversed is %s%n", input, output);
		String [] lookup = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		System.out.print("Please enter string of alphabetic characters: ");
		input = s.nextLine().toUpperCase();
		output = new StringBuilder("");
		for (int i = 0; i < input.length(); ++i)	{
			for (int j = 0; j < lookup.length; ++j)	{
				if (lookup[j].indexOf(input.charAt(i)) != -1)	output.append(j+2);
			}
		}
		System.out.printf("Keypad representation of %s is %s%n", input, output);		
	}
}
