package chapter11_multitasking.waitNotifyMethods.falseRealization;

class Consumer implements Runnable {
	Queue q;

	Consumer(Queue q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			q.get();
		}
	}
}
