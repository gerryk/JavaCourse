import java.util.Scanner;
import java.math.*;

public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a binary number");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int decimal = 0;
		for (int i = s.length()-1; i >= 0; i--)	{
			if (s.charAt(i) == '1')
				decimal += Math.pow(2, (s.length()-1)-i);
		}
		System.out.printf("%s in decimal is %d", s, decimal);
	}
}
