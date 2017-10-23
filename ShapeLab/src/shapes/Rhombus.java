package shapes;

/**
 * @author Katherin Solis Created 10/17/2017 Lab 2.1 shapes
 *
 */
public class Rhombus implements Shape{
	// fields
	private int length;
	private int height;
	

	/**
	 * Constructor method
	 * 
	 * @param 
	 */
	public Rhombus(int length, int height) {
		this.length = length;
		this.height = height;
		
	}

	@Override
	public double calculateArea() {
		// to be implemented by student
		return (height)*(length);
	}

	@Override
	public double calculatePerimeter() {
		// to be implemented by student
		return (2*height)+(2*length);
	}

	@Override
	public String toString() {
		// to be implemented by student
		return "Rhombus length:" + length +"\t Height"+ height+ "\t Perimeter:"+ this.calculatePerimeter() + "\t Area:"
					+this.calculateArea();
	}

}
