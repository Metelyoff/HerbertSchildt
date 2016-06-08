package chapter14_generics.generic_interface;

//A Min/Max interface. 
interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}