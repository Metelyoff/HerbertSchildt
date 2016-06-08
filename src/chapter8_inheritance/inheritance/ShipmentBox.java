package chapter8_inheritance.inheritance;

class ShipmentBox extends BoxWeight {
	double cost;

	ShipmentBox(ShipmentBox ob) {
		super(ob);
		cost = ob.cost;
	}

	ShipmentBox(double w, double h, double d, double m, double c) {
		super(w, h, d, m);
		cost = c;
	}

	ShipmentBox() {
		super();
		cost = 0;
	}

	ShipmentBox(double len, double m, double c) {
		super(len, m);
		cost = c;
	}
}
