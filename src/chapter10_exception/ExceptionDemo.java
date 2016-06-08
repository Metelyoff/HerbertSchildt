package chapter10_exception;

class ExceptionDemo {

	static void compute(int b) throws MyException, ArithmeticException {
		System.out.println("Called compute(" + b + ")");
		if (b < 10)
			throw new MyException(b);
		System.out.println("Normal end");
	}

	public static void main(String[] args) {
		try {
			compute(11);
			compute(11);
		} catch (MyException e) {
			System.out.println("INTERCEPTED " + e);
		}
	}

}
