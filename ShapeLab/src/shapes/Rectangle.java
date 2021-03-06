package shapes;

/**
 * @author Katherin Solis Created 10/17/2017 Lab 2.1 shapes
 *
 */
public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		// To be written by student
		return (length)*(width);
		// return 0.0;
	}


	public double calculatePerimeter() {
		// To be written by student
		return (2*length)+(2*width);
		//return 0.0;
	}


	public String toString() {
		return "Rectangle Width:" + width + " Length:" + length + " Area:" + this.calculateArea() + " Perimeter:"
				+ this.calculatePerimeter();
	}
}
