import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string of alphabetic characters");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count;
		if (s.length() % 2 == 1)
			count = (s.length()-1)/2;
		else
			count = s.length()/2;
		boolean isPalindrome = true;
		for (int i = 0; i < count; i++)	{
			if (s.charAt(i) != s.charAt((s.length()-1)-i))
				isPalindrome = false;
		}
		System.out.printf("%s is %sa palindrome", s, isPalindrome?"":"not ");
	}
}
