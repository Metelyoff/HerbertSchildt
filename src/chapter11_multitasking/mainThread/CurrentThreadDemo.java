package chapter11_multitasking.mainThread;

class CurrentThreadDemo {
	public static void main(String[] args) {

		Thread t = Thread.currentThread();

		System.out.println("Current thread: " + t + "\n");

		t.setName("My Thread");

		System.out.println("After the change name: " + t);

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("The main thread is interrupted");
		}
		System.out.println("End Thread");
	}
}
