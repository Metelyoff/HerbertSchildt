package chapter27_java_util_concurrent.CyclicBarrier;

import java.util.concurrent.*;

class BarDemo {
	public static void main(String args[]) {
		CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

		System.out.println("Starting");

		new MyThread(cb, "A");
		new MyThread(cb, "B");
		new MyThread(cb, "C");

	}
}