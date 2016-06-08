package chapter11_multitasking.useSynchronizedMethods;

class Caller implements Runnable {

	String msg;
	CallMe target;
	Thread t;

	Caller(CallMe targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		target.call(msg);
	}

}
