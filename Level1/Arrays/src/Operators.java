
public class Operators {

	public static void main(String[] args) {
		char op = args[2].charAt(0);
		if (op == '+' || op == '-' || op == '/')	{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			if (op == '+') System.out.printf("%d + %d = %d", num1, num2, num1+num2);
			if (op == '-') System.out.printf("%d - %d = %d", num1, num2, num1-num2);
			if (op == '/') System.out.printf("%d / %d = %d", num1, num2, num1/num2);
		}
	}
}
