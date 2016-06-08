package chapter8_inheritance.modificatorsOfAccess.p2;

class OtherPackage {
	OtherPackage() {

		chapter8_inheritance.modificatorsOfAccess.p1.Protection p = new chapter8_inheritance.modificatorsOfAccess.p1.Protection();
		System.out.println("The constructor of other package");

		// System.out.println("n = "+p.n);
		// System.out.println("n_pri = "+p.n_pri);
		// System.out.println("n_pro = "+p.n_pro);

		System.out.println("n_pub = " + p.n_pub);
	}
}
