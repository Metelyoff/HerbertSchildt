package chapter8_inheritance.inheritance;

class TestMyBox {

	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.5);
		BoxWeight mybox3 = new BoxWeight();
		BoxWeight mycube = new BoxWeight(3, 2);
		BoxWeight myclone = new BoxWeight(mybox1);
		double vol;

		vol = mybox1.volume();
		System.out.println("Volume mybox1 = " + vol);
		System.out.println("Weight mybox1 = " + mybox1.weight);
		System.out.println();

		vol = mybox2.volume();
		System.out.println("Volume mybox2 = " + vol);
		System.out.println("Weight mybox2 = " + mybox2.weight);
		System.out.println();

		vol = mybox3.volume();
		System.out.println("Volume mybox3 = " + vol);
		System.out.println("Weight mybox3 = " + mybox3.weight);
		System.out.println();

		vol = myclone.volume();
		System.out.println("Volume myclone = " + vol);
		System.out.println("Weight myclone = " + myclone.weight);
		System.out.println();

		vol = mycube.volume();
		System.out.println("Volume mycube = " + vol);
		System.out.println("Weight mycube = " + mycube.weight);
		System.out.println();

	}

}
