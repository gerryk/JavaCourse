import java.util.Scanner;
public class Decisions {

	public static void main(String[] args) {
		// all about decisions - if/else & switch/case statements
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100");
		String input = scanner.nextLine();
		int integerNumber = Integer.parseInt(input);
		if (integerNumber > 0 && integerNumber < 101) 	{
			if (integerNumber % 2 == 1)	
				System.out.println("Odd");
			else
				System.out.println("Even");
		} else	{
			System.out.println("Ya done messed up there bud...");
			System.exit(0);
		}
		System.out.println("Ok, now enter a number from 1 - 9");
		input = scanner.nextLine();
		integerNumber = Integer.parseInt(input);
		String valueAsWord = "";
		switch(integerNumber)	{
		case 1:
			valueAsWord = "One";
			break;
		case 2:
			valueAsWord = "Two";
			break;
		case 3:
			valueAsWord = "Three";
			break;
		case 4:
			valueAsWord = "Four";
			break;
		case 5:
			valueAsWord = "Five";
			break;
		case 6:
			valueAsWord = "Six";
			break;
		case 7:
			valueAsWord = "Seven";
			break;
		case 8:
			valueAsWord = "Eight";
			break;
		case 9:
			valueAsWord = "Nine";
			break;
		default:
			System.out.println("Nope... should have been between 1 and 9");
			System.exit(0);
		}
		System.out.println("You entered " + valueAsWord);
		System.out.println("That's all folks");
		scanner.close();
	}
}
