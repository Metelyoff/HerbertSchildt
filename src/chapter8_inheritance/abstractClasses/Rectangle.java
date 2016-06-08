package chapter8_inheritance.abstractClasses;

class Rectangle extends Figure {

	Rectangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("This is area of rectangle!");
		return dim1 * dim2;
	}
}