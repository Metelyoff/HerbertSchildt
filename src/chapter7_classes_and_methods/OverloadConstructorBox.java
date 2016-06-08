package chapter7_classes_and_methods;

class OverloadConstructorBox {
	public static void main(String[] args) {
		Box myBox1 = new Box(2, 4, 6);
		Box myBox2 = new Box();
		Box myBox3 = new Box(7);

		Box myClone = new Box(myBox1);

		System.out.println("My Box1 = " + myBox1.volume());

		System.out.println("My Box2 = " + myBox2.volume());

		System.out.println("My Cube = " + myBox3.volume());

		System.out.println("My Clone = " + myClone.volume());
	}
}
