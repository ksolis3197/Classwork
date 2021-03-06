package shapes;

import java.util.Random;

/**
 *@author Katherin Solis Created 10/17/2017 Lab 2.1 shapes
 *
 */

public class ShapeUtilities {
	
	

	

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(3);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Triangle(rand.nextInt(50), rand.nextInt(50));
		case 4:
			return new Rhombus(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50));
			// Rhombus is the area of two triangles together so do triangle
			
	
		default:
			return new Circle(rand.nextInt(100));
		}

	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[]shapeArr) {
		// To be written by student
		double total = 0;
		int count = 0;
		while( count<shapeArr.length);
		{
			total += shapeArr[count].calculateArea();
			count++;
		}
		return total;
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[]shapeArr) {
		// To be written by student
		double total = 0;
		int count = 0;
		while( count<shapeArr.length);
		{
			
			total += shapeArr[count].calculatePerimeter();
			count++;
		}
		return total;
	}

}
