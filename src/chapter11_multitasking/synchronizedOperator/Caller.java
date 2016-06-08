package chapter11_multitasking.synchronizedOperator;

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
		synchronized (target) {
			target.call(msg);
		}
	}
}
