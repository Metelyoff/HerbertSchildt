package chapter7_classes_and_methods;

class CallByLink {
	int a;
	int b;

	CallByLink(int i, int j) {
		a = i;
		b = j;
	}

	void meth(CallByLink ob) {
		ob.a *= 2;
		ob.b /= 2;
	}
}
