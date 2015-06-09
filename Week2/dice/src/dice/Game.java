package dice;

public class Game {
	int guess;
	int dice;
	String result;
	public Game(int guess, int dice, String result)	{
		this.dice = dice;
		this.guess = guess;
		this.result = result;
	}
	public int getGuess() {
		return guess;
	}
	public void setGuess(int guess) {
		this.guess = guess;
	}
	public int getDice() {
		return dice;
	}
	public void setDice(int dice) {
		this.dice = dice;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Game [guess=" + guess + ", dice=" + dice + ", result=" + result
				+ "]";
	}
}
