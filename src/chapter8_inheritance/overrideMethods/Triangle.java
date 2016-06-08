package chapter8_inheritance.overrideMethods;

class Triangle extends Figure {

	Triangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("This is area of triangle!");
		return dim1 * dim2 / 2;
	}
}