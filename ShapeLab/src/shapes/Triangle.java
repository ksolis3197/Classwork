package shapes;

/**
 * @author Katherin Solis Created 10/17/2017 Lab 2.1 shapes
 *
 */
public class Triangle implements Shape 
{
	private int height;
	private int base;

	public Triangle(int base, int height) {
		this.height = height;
		this.base = base;
	}


	public double calculateArea() {
		// To be written by student
		return (base/2)*height;
		// return 0.0;
	}


	public double calculatePerimeter() {
		// To be written by student
		double hyp = Math.sqrt((base*base)+(height*height));
		return hyp + height + base ;
		//return 0.0;
	}


	public String toString() {
		return "Triangle Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
