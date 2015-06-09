import java.util.Random;

public class Deck {
	// TODO Auto-generated method stub
	private Card [] deck = new Card[52];
	public Deck()	{
		int count = 0;
		for (Suit suit: Suit.values())	{
			for (Rank rank: Rank.values())	{
				this.deck[count++] = new Card(suit,rank);
			}
		}
	}
	public String toString()	{
		String result = "";
		for (int i = 0; i < 52; i++)	{
			result += (this.deck[i].toString() + "\n");
		}	
		return result;
	}
	
	public void shuffle()	{
		int cardNumber1, cardNumber2;
		Random rand = new Random();
		for (int i = 0; i <= 52; i++)	{
			cardNumber1 = rand.nextInt(51);
			cardNumber2 = rand.nextInt(51);
			this.swap(this.deck[cardNumber1], this.deck[cardNumber2]);
		}
	}
	
	private void swap(Card card1, Card card2)	{
		Card temp;
		temp = card1;
		card1 = card2;
		card2 = temp;
	}
}

