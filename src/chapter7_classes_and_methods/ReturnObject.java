package chapter7_classes_and_methods;

class ReturnObject {
	int a;

	ReturnObject(int i) {
		a = i;
	}

	ReturnObject meth() {
		ReturnObject temp = new ReturnObject(a + 10);
		return temp;
	}
}
