package chapter11_multitasking.newPauseResumptionStop;

class NewThread implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;

	NewThread(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("new thread: " + t);
		suspendFlag = false;
		t.start();
	}

	public void run() {
		try {
			for (int i = 10; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
				synchronized (this) {
					while (suspendFlag)
						wait();
				}
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted");
		}
		System.out.println(name + " end");
	}

	synchronized void mySuspend() {
		suspendFlag = true;
	}

	synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
}
