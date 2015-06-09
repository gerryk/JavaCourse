package dice;

import java.util.Random;

public class Dice {
	public int throwDice()	{
		Random r = new Random();
		return r.nextInt(6);
	}
}

