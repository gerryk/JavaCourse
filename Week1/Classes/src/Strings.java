import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string of alphabetic characters");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--)	{
			rev += s.charAt(i);
		}
		System.out.println( s + " reversed is " + rev);
		String [][] numberMap = {{"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"},
							   {"1","2","3","4","5","6","7","8","9"}};
		String num = "Translation: ";
		System.out.println("Now enter another string of alphabetic characters");
		s = sc.next();
		for (int i = 0;i < s.length(); i++ )	{
			for (int j = 0; j < 8; j++)	{
				if (numberMap[0][j].indexOf(s.toUpperCase().charAt(i)) != -1)	{
					num += numberMap[1][j];
				}
			}
		}
		System.out.print(num);
		sc.close();
	}
}
