package chapter8_inheritance.interfaces;

class Client implements CallBack {
	public void callBack(int p) {
		System.out.println("Method callBack calling with the parameter = " + p);
	}

	void nonIfaceMeth() {
		System.out.println("Other methods in the classes");
	}
}