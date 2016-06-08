package chapter7_classes_and_methods.recursion;

class Factorial {
	int fac(int n) {
		System.out.println(n);
		int result;
		if (n == 1)
			return 1;
		result = fac(n - 1) * n;
		return result;
	}
}
