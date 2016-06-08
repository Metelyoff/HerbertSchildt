package chapter12_EnumsWrappersAnnotation.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno4 {
	String str();

	int val();
}

class MetaWithParameters {

	// myMeth now has two arguments.
	@MyAnno4(str = "Two Parameters", val = 19)
	public static void myMeth(String str, int i) {
		Meta ob = new Meta();

		try {
			Class<?> c = ob.getClass();

			// Here, the parameter types are specified.
			Method m = c.getMethod("myMeth", String.class, int.class);

			MyAnno4 anno = m.getAnnotation(MyAnno4.class);

			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String args[]) {
		myMeth("test", 10);
	}
}
