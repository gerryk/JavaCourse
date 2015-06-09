import java.util.Random;

public class Deck {
	private Card [] deck;
	private int nextCard;
	public Deck() {
		resetDeck();
	}
	public String toString()	{
		String deckAsString = "";
		for (int i = 0; i < 52; ++i)	{
			deckAsString = deckAsString.concat(this.deck[i].toString()+"\n");
		}
		return deckAsString;
	}
	public void shuffle()	{
		Card temp;
		Random rand = new Random();
		int first;
		int second; 
		for (int j = 0; j < 500; ++j)	{
			first = rand.nextInt(52);
			second = rand.nextInt(52);
			temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	public Card dealNext()	{
		Card c = deck[nextCard];
		deck[nextCard--] = null;
		return c;
	}
	public void resetDeck()	{
		nextCard = 51;
		this.deck = new Card[52];
		int card = 0;
		for (Suit s : Suit.values())	{
			for (Rank r :  Rank.values())	{
				this.deck[card++] = new Card(r, s);
			}
		}
	}
}
