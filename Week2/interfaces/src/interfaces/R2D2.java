package interfaces;

public class R2D2 extends GenericRobot implements Moveable {

	protected int wheels;
	protected int x, y;
	
	public R2D2(String name, int wheels) {
		super(name);
		this.wheels = wheels;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString()	{
		return this.name + " " + this.getClass() + "@" + x + "," + y;
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
}
