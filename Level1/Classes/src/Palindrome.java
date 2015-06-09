import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPalindrome = true; 
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String input = s.nextLine();
		for (int i = 0; i < input.length()/2; ++i)	{
			if (input.charAt(i) != input.charAt((input.length()-1)-i))	{
				isPalindrome = false;
				break;
			}
		}
		System.out.printf("%s is%s a palindrome", input, isPalindrome?"":" not");
	}
}
