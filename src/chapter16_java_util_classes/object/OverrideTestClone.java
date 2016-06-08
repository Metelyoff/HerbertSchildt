package chapter16_java_util_classes.object;

//Override the clone() method.

class OverrideTestClone implements Cloneable {
	int a;
	double b;

	// clone() is now overridden and is public.
	public Object clone() {
		try {
			// call clone in Object.
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}
}