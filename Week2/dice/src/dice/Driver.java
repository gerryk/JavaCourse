package dice;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Game[] games = new Game[10];
		int historyIndex = 0;
		Dice d = new Dice();
		Scanner s = new Scanner(System.in);
		boolean goAgain = true;
		do {
			System.out.println("Enter a number between 1 and 6");
			String input = s.nextLine();
			if(input.toUpperCase().charAt(0) == 'H')	{
				showHistory(games, historyIndex);
			} else	{
				String result = "";
				int guess = Integer.parseInt(input);
				if (guess < 1 || guess > 6)	{
					System.out.println("Not in the correct range...");
				} else	{
					int dice = d.throwDice();
					System.out.println(dice);
					if(guess < dice)	{
						System.out.println("You lose...");
						result =  "Lose";
					}
					if(guess > dice)	{
						System.out.println("You win...");
						result =  "Win";
					}
					if(guess == dice)	{
						System.out.println("Draw...");
						result =  "Draw";
					}
					Game g = new Game(dice, guess, result);
					games[historyIndex] = g;
					if (++historyIndex > 9)
						historyIndex = 0;
				}
				System.out.println("Go Again Y/N?");
				input = s.nextLine();
				if(input.toUpperCase().charAt(0) != 'Y')
					goAgain = false;
			}
		} while (goAgain);
		System.out.println("Bye bye...");
	}
	
	public static void showHistory(Game[] games, int index)	{
		int game = 0;
		for(int i = index; i >= 0; --i)	{
			System.out.printf("Game %d %s\n", ++game, games[i] != null?games[i].toString():"Not played");
		}
		for(int i = games.length; i >= index; --i)	{
			System.out.printf("Game %d %s\n", ++game, games[i] != null?games[i].toString():"Not played");
		}
		
	}
}