package chapter8_inheritance.inheritance;

class PlainBox {
	public static void main(String args[]) {
		BoxWeight weightbox = new BoxWeight(3, 4, 5, 6.6);
		Box plainbox = new Box();
		double vol;

		vol = weightbox.volume();
		System.out.println("Volume weightbox = " + vol);
		System.out.println("Weight weightbox = " + weightbox.weight);
		System.out.println();

		plainbox = weightbox;
		vol = plainbox.volume();
		System.out.println("Volume plainbox = " + vol);
	}
}
