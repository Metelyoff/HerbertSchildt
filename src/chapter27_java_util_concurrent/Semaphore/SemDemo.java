package chapter27_java_util_concurrent.Semaphore;

import java.util.concurrent.*;

class SemDemo {

	public static void main(String args[]) {
		Semaphore sem = new Semaphore(1);

		new IncThread(sem, "A");
		new DecThread(sem, "B");

	}
}