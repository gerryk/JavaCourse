package interfaces;

public abstract class GenericRobot {
	
	protected String name;
	
	public GenericRobot(String name) {
		this.name = name;
	}
	
	public GenericRobot()	{
		
	}

	public abstract String getName();

}
