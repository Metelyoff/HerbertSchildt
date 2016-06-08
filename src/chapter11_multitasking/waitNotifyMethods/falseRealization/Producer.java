package chapter11_multitasking.waitNotifyMethods.falseRealization;

class Producer implements Runnable {
	Queue q;

	Producer(Queue q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			q.put(i);
		}
	}
}
