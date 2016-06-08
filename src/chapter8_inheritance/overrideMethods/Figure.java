package chapter8_inheritance.overrideMethods;

class Figure {

	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	double area() {
		System.out.println("The area of figure is not correct!");
		return 0;
	}

}