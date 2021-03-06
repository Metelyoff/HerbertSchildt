package chapter27_java_util_concurrent.Callable;

import java.util.concurrent.Callable;

class Sum implements Callable<Integer> {
	int stop;

	Sum(int v) {
		stop = v;
	}

	public Integer call() {
		int sum = 0;
		for (int i = 1; i <= stop; i++) {
			sum += i;
		}
		return sum;
	}
}
