package interfaces;

public class C3P0 extends GenericRobot {

	protected int joints;
	public C3P0(String name, int joints) {
		super(name);
		this.joints = joints;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String toString()	{
		return this.name + " " + this.getClass();
	}
}
