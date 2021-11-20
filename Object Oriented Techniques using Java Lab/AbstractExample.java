package q11287;

abstract class Shape{
	void numberOfSides(){
	}
}

class Trapezoid extends Shape{
	void numberOfSides(){
		System.out.println("Number of sides in a trapezoid are 4");
	}
}

class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("Number of sides in a triangle are 3");
	}
}

class Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("Number of sides in a hexagon are 6");
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		Shape s;
		s = new Trapezoid();
		s.numberOfSides();
		s = new Triangle();
		s.numberOfSides();
		s = new Hexagon();
		s.numberOfSides();
	}
}
