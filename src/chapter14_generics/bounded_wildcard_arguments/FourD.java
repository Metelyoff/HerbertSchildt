package chapter14_generics.bounded_wildcard_arguments;

class FourD extends ThreeD {
	int t;

	FourD(int a, int b, int c, int d) {
		super(a, b, c);
		t = d;
	}
}