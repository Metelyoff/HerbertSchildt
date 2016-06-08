package chapter27_java_util_concurrent.Callable;

import java.util.concurrent.Callable;

class Factorial implements Callable<Integer> {
	int stop;

	Factorial(int v) {
		stop = v;
	}

	public Integer call() {
		int fact = 1;
		for (int i = 2; i <= stop; i++) {
			fact *= i;
		}
		return fact;
	}
}