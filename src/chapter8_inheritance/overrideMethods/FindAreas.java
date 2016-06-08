package chapter8_inheritance.overrideMethods;

class FindAreas {
	public static void main(String[] args) {

		Figure f = new Figure(2, 2);
		Rectangle r = new Rectangle(2, 3);
		Triangle t = new Triangle(4, 5);

		Figure figref;

		figref = r;
		System.out.println("The area is " + figref.area());

		figref = t;
		System.out.println("The area is " + figref.area());

		figref = f;
		System.out.println("The area is " + figref.area());

	}
}