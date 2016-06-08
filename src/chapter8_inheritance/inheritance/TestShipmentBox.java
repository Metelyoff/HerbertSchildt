package chapter8_inheritance.inheritance;

class TestShipmentBox {
	public static void main(String[] args) {
		ShipmentBox ship1 = new ShipmentBox(10, 20, 15, 10, 3.35);
		ShipmentBox ship2 = new ShipmentBox(2, 3, 4, 1.5, 2);

		double vol;

		vol = ship1.volume();
		System.out.println("Volume box in ship1 = " + vol);
		System.out.println("Weight box in ship1 = " + ship1.weight);
		System.out.println("Cost box in ship1 = $" + ship1.cost);
		System.out.println();

		vol = ship2.volume();
		System.out.println("Volume box in ship2 = " + vol);
		System.out.println("Weight box in ship2 = " + ship2.weight);
		System.out.println("Cost box in ship2 = $" + ship2.cost);
		System.out.println();
	}
}
