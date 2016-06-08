package chapter14_generics.bound_by_object;

//Here, T is bound by Object by default. 
class Gen<T> {
	T ob; // here, T will be replaced by Object

	Gen(T o) {
		ob = o;
	}

	// Return ob.
	T getob() {
		return ob;
	}
}