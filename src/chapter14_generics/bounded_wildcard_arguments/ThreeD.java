package chapter14_generics.bounded_wildcard_arguments;

//Three-dimensional coordinates. 
class ThreeD extends TwoD {
	int z;

	ThreeD(int a, int b, int c) {
		super(a, b);
		z = c;
	}
}