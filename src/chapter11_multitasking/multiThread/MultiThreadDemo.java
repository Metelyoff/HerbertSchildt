package chapter11_multitasking.multiThread;

class MultiThreadDemo {
	public static void main(String[] args) {

		new NewThread("one");
		new NewThread("two");
		new NewThread("three");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}

		System.out.println("Main thread end");
	}
}
