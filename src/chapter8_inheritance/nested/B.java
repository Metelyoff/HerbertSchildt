package chapter8_inheritance.nested;

class B implements A.NestedIf {
	public boolean notNegative(int x) {
		return x < 0 ? false : true;
	}
}