package chapter16_java_util_classes.object;

//Demonstrate the clone() method.

class TestClone implements Cloneable {
	int a;
	double b;

	// This method calls Object's clone().
	TestClone cloneTest() {
		try {
			// call clone in Object.
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}
}