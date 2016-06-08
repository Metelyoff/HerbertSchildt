package chapter11_multitasking.implementationRunnable;

class NewThread implements Runnable {

	Thread t;

	NewThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Branch thread created: " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Branch thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("The branch thread interrupted");
		}
		System.out.println("Branch thread end");
	}
}
