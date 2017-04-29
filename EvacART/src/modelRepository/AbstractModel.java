package modelRepository;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;

public abstract class AbstractModel {
	protected int modelWidth;
	protected int modelHeight;

	protected int numberOfExits;
	protected Collection<Point> locationOfExits;	
	protected int numberOfExitSigns;
	protected Collection<Point> locationOfExitSigns;
	protected int numberOfDoors;
	protected Collection<Point> locationOfDoors;
	protected int numberOfFireExinguishers;
	protected Collection<Point> locationOfFireExinguishers;
	
	protected Collection<Rectangle> locationOfBarriers;

	public AbstractModel() {
		
	}
	
	public abstract void moveDoors(Point startLocation, Point endLocation);
	public abstract void moveBarriers(Point startLocation, Point endLocaion);
	public abstract void rotateBarrier(Rectangle barrier, double cwAngle);
}
