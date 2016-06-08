package chapter6_classes;

class MyBox5 {
	public static void main(String[] args) {
		Box myBox1 = new Box(3, 6, 9);
		Box myBox2 = new Box(2, 5, 8);
		double vol;
		vol = myBox1.volume();
		System.out.println("Obyom1 = " + vol);
		vol = myBox2.volume();
		System.out.println("Obyom2 = " + vol);
	}
}
