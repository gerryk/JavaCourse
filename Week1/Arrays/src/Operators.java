
public class Operators {
	public static void main(String[] args) {
		if (args.length > 3)
			System.exit(1);
		double val1 = Double.parseDouble(args[0]);
		double val2 = Double.parseDouble(args[1]);
		switch (args[2]) {
			case "+":
				System.out.println(val1 + val2);
				break;
			case "-":
				System.out.println(val1 - val2);
				break;
			case "*":
				System.out.println(val1 * val2);
				break;
			case "/":
				System.out.println(val1 / val2);
				break;
			default:
				System.out.println("?");
				break;
		}
	}
}
