package chapter8_inheritance.modificatorsOfAccess.p2;

class Protection2 extends chapter8_inheritance.modificatorsOfAccess.p1.Protection {
	Protection2() {
		System.out.println("Inheritance constructor of another package Protection2");

		// System.out.println("n = "+n);
		// System.out.println("n_pri = "+n_pri);

		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}
