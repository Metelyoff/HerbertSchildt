package chapter11_multitasking.waitNotifyMethods.trueRealization;

class Queue {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		System.out.println("поток " + Thread.currentThread().getName() + " в методe get");
		System.out.println(valueSet + " возобновить поток для вставки " + n);
		while (!valueSet)
			try {
				wait();
				System.out.println("метод get ждёт");
			} catch (InterruptedException e) {
				System.out.println("Interrupted get");
			}
		System.out.println(valueSet + " возобновить поток для вставки " + n);
		System.out.println("получение N: " + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		System.out.println("поток " + Thread.currentThread().getName() + " в методе put");
		System.out.println(valueSet + " возобновить поток для получения " + n);
		while (valueSet)
			try {
				wait();
				System.out.println("метод put ждёт");
			} catch (InterruptedException e) {
				System.out.println("Interrupted put");
			}
		this.n = n;
		valueSet = true;
		System.out.println("вставка N: " + n);
		notify();
		System.out.println(valueSet + " возобновить поток для получения " + n);
	}
}
