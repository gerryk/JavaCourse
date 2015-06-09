import java.util.Scanner;

/**
 * 
 */

/**
 * @author egerkav
 *
 */
public class Decisions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean ok = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100.");
		String input = scanner.nextLine();
		int integerNum = Integer.parseInt(input);
		if (integerNum < 1 || integerNum > 100)	{
			ok = false;
			System.out.println("Number out of range...");
		}
		if (ok)	{
			String oddOrEven;
			if (integerNum % 2 == 1)	
				oddOrEven = "Odd";
			else
				oddOrEven = "Even";
			System.out.println(integerNum + " is " + oddOrEven);
		}
		if (ok)	{
			System.out.println("Enter a number from 1 to 9.");
			input = scanner.nextLine();
			integerNum = Integer.parseInt(input);
			if (integerNum < 1 || integerNum > 9)	{
				ok = false;
				System.out.println("Number is not between 1 and 9...");
			} else	{
				switch(integerNum)	{
				case 1:
					System.out.println("You entered ONE.");
					break;
				case 2:
					System.out.println("You entered TWO.");
					break;
				case 3:
					System.out.println("You entered THREE.");
					break;
				case 4:
					System.out.println("You entered FOUR.");
					break;
				case 5:
					System.out.println("You entered FIVE.");
					break;
				case 6:
					System.out.println("You entered SIX.");
					break;
				case 7:
					System.out.println("You entered SEVEN.");
					break;
				case 8:
					System.out.println("You entered EIGHT.");
					break;
				case 9:
					System.out.println("You entered NINE.");
					break;				
				}
				
			}
			if (ok)	{
				System.out.println("Enter a number.");
				input = scanner.nextLine();
				int firstInt = Integer.parseInt(input);
				System.out.println("Enter another number.");
				input = scanner.nextLine();
				int secondInt = Integer.parseInt(input);
				if (firstInt > secondInt)	{
					System.out.println(firstInt + " is bigger than " + secondInt);
				} else	{
					System.out.println(secondInt + " is bigger than " + firstInt);					
				}
				
			}
		
		}

	}

}
