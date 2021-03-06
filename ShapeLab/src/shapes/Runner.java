package shapes;
/**
 * @author Katherin Solis Created 10/17/2017 Lab 2.1 shapes
 * 
 *         Lab 2.1 shapes Create implement all necessary methods in this package
 *         to run the code below successfully. After your code below runs
 *         successfully, you will design, implement, and test a couple of your
 *         own Shape classes.
 * 
 *         Choose one of the following: Triangle, Pentagon, Hexagon, Heptagon,
 *         etc. Choose one of the following: Rhombus, Trapezoid, Parallelogram,
 *         Kite
 * 
 *         Both classes must extend shape, and implement all necessary methods.
 */
public class Runner {

	public static void main(String[] args) {
		Shape circle1 = new Circle(3);
		Shape rectangle1 = new Rectangle(10, 4);
		//length and width
		Shape square1 = new Square(10);
		Shape triangle1 = new Triangle(6,4);
		Shape rhombus1 = new Rhombus(10,12,6);

		
		
		//System.out.println("First test out the hard coded shape arraay.");
		

		Shape[] shapeArr = { circle1, rectangle1, square1, triangle1, rhombus1};

		for (Shape shape : shapeArr)
		{
			System.out.println(shape);
		}
		//System.out.println("Did the shapes above add up to the total printed here?");
		System.out.println(" ");
		System.out.println("Total Area: " + ShapeUtilities.sumArea(shapeArr)); // 168.26
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr)); // 86.84
		System.out.println(" ");

		//System.out.println("Did the three shapes above add up to the total printed here?");
		
		

		System.out.println("Now testing the random array.");

		shapeArr = new Shape[10];

		// Why are we using a for loop instead of a for-each loop here?
		for (int i = 0; i < shapeArr.length; i++) {
			shapeArr[i] = ShapeUtilities.randomShape();
		}

		for (Shape shape : shapeArr) 
		{
			System.out.println(shape);
		}
		System.out.println(" ");
		System.out.println("Total Area: " + ShapeUtilities.sumArea(shapeArr));
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr));

	}

}
