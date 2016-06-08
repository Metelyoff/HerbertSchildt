package chapter14_generics.generic_hierarchy;

//A simple generic class hierarchy. 
class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	// Return ob.
	T getob() {
		return ob;
	}
}