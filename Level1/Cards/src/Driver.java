
public class Driver {

	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.print(d.toString());
		d.shuffle();
		System.out.print(d.toString());
		for (int i = 0; i < 52; ++i)	{
			System.out.printf("Card %d %s%n", i+1, d.dealNext().toString());
		}
	}
}
