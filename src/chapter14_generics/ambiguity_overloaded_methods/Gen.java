package chapter14_generics.ambiguity_overloaded_methods;

//Can't create an instance of T. 
class Gen<T> {
	T ob;

	Gen() {
		//ob = new T(); // Illegal!!!
	}
}