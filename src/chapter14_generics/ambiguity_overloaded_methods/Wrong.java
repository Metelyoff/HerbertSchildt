package chapter14_generics.ambiguity_overloaded_methods;

class Wrong<T> {
	// Wrong, no static variables of type T.
	//static T ob;

	// Wrong, no static method can use T.
	//static T getob() {
	//	return ob;
	//}
}