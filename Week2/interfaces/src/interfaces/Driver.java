package interfaces;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Random r = new Random();
		GenericRobot[] robots = new GenericRobot[4];
		robots[0] = RobotFactory.createRobot("Artoo", 3);
		robots[1] = RobotFactory.createRobot("Seethreepio", 13);
		robots[2] = RobotFactory.createRobot("R5D4", 3);
		robots[3] = RobotFactory.createRobot("Scruffy looking nerfherder", 1);
		
		System.out.println("Initial state");
		for(GenericRobot robit: robots)	{
			System.out.println(robit.toString());
		}
		System.out.println("Move moveables random amounts 10 times");
		for(int i = 0; i < 10; ++i)	{
			System.out.printf("Move %d\n", i);
			for(GenericRobot robit: robots)	{
				if(robit instanceof Moveable)	
					((Moveable) robit).move(r.nextInt(20), r.nextInt(20));
				System.out.println(robit.toString());
			}
		}
	}
}
