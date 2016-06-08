package chapter14_generics.bridge_method;

//A situation that creates a bridge method. 
class Gen<T> {
	T ob; // declare an object of type T

	// Pass the constructor a reference to
	// an object of type T.
	Gen(T o) {
		ob = o;
	}

	// Return ob.
	T getob() {
		return ob;
	}
}