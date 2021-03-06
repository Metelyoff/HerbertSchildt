package chapter11_multitasking.useWaitMethodsJoinIsAlive;

class NewThread implements Runnable {

	String name;
	Thread t;

	NewThread(String threadName) {
		name = threadName;
		t = new Thread(this, threadName);
		System.out.println("New thread: " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted");
		}
		System.out.println(name + " end!");
	}
}
