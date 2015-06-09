import java.util.Scanner;


public class bin2dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binaryInput;
		boolean isBinary = true;
		int decimalOutput = 0;
		if (args.length == 0)	{
			System.out.print("Enter a binary number: ");
			Scanner s = new Scanner(System.in);
			binaryInput = s.nextLine();
			s.close();
		} else	{
			binaryInput = args[0];
		}
		for (int i = 0; i < binaryInput.length(); ++i)	{
			if (binaryInput.charAt(i) != '0' && binaryInput.charAt(i) != '1')	{
				isBinary = false;
				break;
			}
		}
		if (isBinary)	{
			for (int i = binaryInput.length(); i > 0; --i)	{
				if (binaryInput.charAt(i-1) == '1') decimalOutput += Math.pow(2, binaryInput.length()-i);
			}
			System.out.printf("%s in binary is %d%n", binaryInput, decimalOutput);
		} else	{
			System.out.printf("Not a binary%n");		
		}
	}
}
