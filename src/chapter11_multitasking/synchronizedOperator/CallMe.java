package chapter11_multitasking.synchronizedOperator;

class CallMe {
	void call(String msg) {
		System.out.print("[" + msg);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
		System.out.println("]");
	}
}
