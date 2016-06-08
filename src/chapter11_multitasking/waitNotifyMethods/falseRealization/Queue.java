package chapter11_multitasking.waitNotifyMethods.falseRealization;

class Queue {
	int n;

	synchronized int get() {
		System.out.println("get N: " + n);
		return n;
	}

	synchronized void put(int n) {
		this.n = n;
		System.out.println("put N: " + n);
	}
}
