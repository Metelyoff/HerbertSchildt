package chapter27_java_util_concurrent.lock;

import java.util.concurrent.locks.*;

class LockDemo {

	public static void main(String args[]) {
		ReentrantLock lock = new ReentrantLock();

		new LockThread(lock, "A");
		new LockThread(lock, "B");

	}
}