package chapter27_java_util_concurrent.Semaphore;

class ProdCon {
	public static void main(String args[]) {
		Q q = new Q();
		new Consumer(q);
		new Producer(q);
	}
}