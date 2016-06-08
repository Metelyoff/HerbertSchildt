package chapter11_multitasking.useWaitMethodsJoinIsAlive;

class DemoJoin {
	public static void main(String[] args) {
		NewThread nt1 = new NewThread("one");
		NewThread nt2 = new NewThread("two");
		NewThread nt3 = new NewThread("three");

		System.out.println("First thread runned: " + nt1.t.isAlive());
		System.out.println("Second thread runned: " + nt2.t.isAlive());
		System.out.println("Third thread runned: " + nt3.t.isAlive());

		try {
			System.out.println("Waiting for the end threads: ");
			nt1.t.join();
			nt2.t.join();
			nt3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted!");
		}

		System.out.println("First thread runned: " + nt1.t.isAlive());
		System.out.println("Second thread runned: " + nt2.t.isAlive());
		System.out.println("Third thread runned: " + nt3.t.isAlive());
		System.out.println("Main thread end");
	}
}
