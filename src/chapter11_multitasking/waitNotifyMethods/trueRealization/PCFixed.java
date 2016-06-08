package chapter11_multitasking.waitNotifyMethods.trueRealization;

class PCFixed {
	public static void main(String args[]) {
		Queue q = new Queue();
		new Producer(q);
		new Consumer(q);
	}
}
