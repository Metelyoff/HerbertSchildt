package chapter11_multitasking.waitNotifyMethods.trueRealization;

class Consumer implements Runnable {
	Queue q;
	Thread consumer;

	Consumer(Queue q) {
		this.q = q;
		consumer = new Thread(this, "Получатель");
		consumer.start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			q.get();
		}
	}
}
