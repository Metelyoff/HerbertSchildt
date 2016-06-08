package chapter8_inheritance.interfaces;

class TestIface2 {
	public static void main(String[] args) {
		CallBack c = new Client();
		Client2 c2 = new Client2();

		c.callBack(88);
		c = c2;
		c.callBack(5);
	}

}
