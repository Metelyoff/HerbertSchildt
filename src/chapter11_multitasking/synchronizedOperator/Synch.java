package chapter11_multitasking.synchronizedOperator;

class Synch {
	public static void main(String[] args) {

		CallMe target = new CallMe();
		Caller c1 = new Caller(target, "Wellcome ");
		Caller c2 = new Caller(target, "to the synchronized ");
		Caller c3 = new Caller(target, "world!");

		try {
			c1.t.join();
			c2.t.join();
			c3.t.join();
		} catch (InterruptedException e) {
			System.out.println("interrupted join thread");
		}
	}
}
