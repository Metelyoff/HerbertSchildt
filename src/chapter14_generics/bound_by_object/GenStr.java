package chapter14_generics.bound_by_object;

//Here, T is bound by String. 
class GenStr<T extends String> {
	T str; // here, T will be replaced by String

	GenStr(T o) {
		str = o;
	}

	T getstr() {
		return str;
	}
}