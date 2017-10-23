package shapes;

/**
 * @author Katherin Solis Created 10/17/2017 Lab 2.1 shapes
 *
 */
public class Rhombus implements Shape{
	// fields
	private int d1;
	private int d2;
	private int side;
	

	/**
	 * Constructor method
	 * 
	 * @param 
	 */
	public Rhombus(int d1, int d2, int side) {
		this.d1 = d1;
		this.d2 = d2;
		this.side = side;
		
	}

	@Override
	public double calculateArea() {
		// to be implemented by student
		return ((d2*d1)/2);
	}

	@Override
	public double calculatePerimeter() {
		// to be implemented by student
		return (side)+(side)+side+side;
	}

	@Override
	public String toString() {
		// to be implemented by student
		return "Rhombus Diagonal 1:" + d1 +"\t Diagonal 2:"+ d2+ "\t Perimeter:"+ this.calculatePerimeter() + "\t Area:"
					+this.calculateArea();
	}

}
