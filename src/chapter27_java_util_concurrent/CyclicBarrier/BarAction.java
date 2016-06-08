package chapter27_java_util_concurrent.CyclicBarrier;

class BarAction implements Runnable {
	public void run() {
		System.out.println("Barrier Reached!");
	}
}