package chapter27_java_util_concurrent.CountDownLatch;

import java.util.concurrent.CountDownLatch;

class CDLDemo {
	public static void main(String args[]) {
		CountDownLatch cdl = new CountDownLatch(5);

		System.out.println("Starting");

		new MyThread(cdl);

		try {
			cdl.await();
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}

		System.out.println("Done");
	}
}