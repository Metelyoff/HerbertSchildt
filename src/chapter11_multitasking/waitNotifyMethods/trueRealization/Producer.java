package chapter11_multitasking.waitNotifyMethods.trueRealization;

class Producer implements Runnable {
	Queue q;
	Thread producer;

	Producer(Queue q) {
		this.q = q;
		producer = new Thread(this, "Отправитель");
		producer.start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			q.put(i);
		}
	}
}
