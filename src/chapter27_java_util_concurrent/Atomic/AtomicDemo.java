package chapter27_java_util_concurrent.Atomic;

class AtomicDemo {

	public static void main(String args[]) {
		new AtomThread("A");
		new AtomThread("B");
		new AtomThread("C");
	}
}