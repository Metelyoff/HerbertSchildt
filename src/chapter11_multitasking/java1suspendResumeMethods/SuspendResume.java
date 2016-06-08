package chapter11_multitasking.java1suspendResumeMethods;

class SuspendResume {
	public static void main(String args[]) {
		NewThread nt1 = new NewThread("one");
		NewThread nt2 = new NewThread("two");

		try {
			Thread.sleep(1500);
			nt1.t.suspend();
			System.out.println("pause thread one");
			Thread.sleep(1500);
			nt1.t.resume();
			System.out.println("resume thread one");
			Thread.sleep(1500);
			nt2.t.suspend();
			System.out.println("pause thread two");
			Thread.sleep(1500);
			nt2.t.resume();
			System.out.println("resume thread two");
		} catch (InterruptedException e) {
			System.out.println("main thread inyerrupted");
		}
		try {
			System.out.println("waiting for end threads");
			nt1.t.join();
			nt2.t.join();
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread end");
	}
}
