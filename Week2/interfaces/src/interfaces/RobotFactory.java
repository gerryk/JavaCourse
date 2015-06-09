package interfaces;

import java.util.Random;

public class RobotFactory {

	public RobotFactory() {
		// TODO Auto-generated constructor stub
	}

	public static GenericRobot createRobot(String name, int wheelsOrJoints)	{
		Random r = new Random();
		GenericRobot robit;
		if (r.nextInt(10)%2==0)	
			robit = new R2D2(name, wheelsOrJoints);
		else
			robit = new C3P0(name, wheelsOrJoints);
		return robit;
	}
}
