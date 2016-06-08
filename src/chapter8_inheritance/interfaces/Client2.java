package chapter8_inheritance.interfaces;

class Client2 implements CallBack {
	public void callBack(int p) {
		System.out.println("client2");
		System.out.println("p*p = " + (p * p));
	}
}