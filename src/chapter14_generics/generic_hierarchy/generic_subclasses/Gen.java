package chapter14_generics.generic_hierarchy.generic_subclasses;

//A subclass can add its own type parameters. 
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