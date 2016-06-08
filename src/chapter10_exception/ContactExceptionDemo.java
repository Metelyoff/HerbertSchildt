package chapter10_exception;

class ContactExceptionDemo {

	static void demoproc() {
		NullPointerException e = new NullPointerException("Up level");
		e.initCause(new ArithmeticException("Cause"));
		throw e;
	}

	public static void main(String[] args) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("intercepted exception: " + e);
			System.out.println("original cause: " + e.getCause());
		}
	}
}
