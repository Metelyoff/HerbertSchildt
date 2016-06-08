package chapter11_multitasking.newPauseResumptionStop;

class NewSuspendReaume {
	public static void main(String args[]) {

		NewThread nt1 = new NewThread("one");
		NewThread nt2 = new NewThread("two");

		try {
			Thread.sleep(1000);
			nt1.mySuspend();
			System.out.println("suspend thread one");
			Thread.sleep(1000);
			nt1.myResume();
			System.out.println("resume thread one");
			Thread.sleep(1000);
			nt2.mySuspend();
			System.out.println("suspend thread two");
			Thread.sleep(1000);
			nt2.myResume();
			System.out.println("resume thread two");
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
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
