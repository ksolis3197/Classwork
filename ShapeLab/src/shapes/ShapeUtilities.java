package shapes;

import java.util.Random;

public class ShapeUtilities {
	public static Shape getRandomShape()
	{
		Random r = newRandom();
		int x = r.nextInt(3);
		s.witch(x);
		{
			case 0:
				return new Circle(r.nextInt(100)+1):
			case 1:
				return new Rectangle(r.nextInt(100)+1)+(r.nextInt(100)+1):
			case 2:
				return new Square(r.nextInt(100)+1):
			default:
				return new Square(r.nextInt(100)+1):
		}
		
	}
}
