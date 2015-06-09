
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		System.out.printf(deck.toString());
		deck.shuffle();
		System.out.printf(deck.toString());
	}
}
