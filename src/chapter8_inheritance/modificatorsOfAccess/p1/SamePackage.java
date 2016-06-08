package chapter8_inheritance.modificatorsOfAccess.p1;

class SamePackage {
	SamePackage() {

		Protection p = new Protection();
		System.out.println("This is constructor of the same package in p1");
		System.out.println("n = " + p.n);

		// System.out.println("n_pri = "+p.n_pri);

		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
