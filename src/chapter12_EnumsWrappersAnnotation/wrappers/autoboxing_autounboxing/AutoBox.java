package chapter12_EnumsWrappersAnnotation.wrappers.autoboxing_autounboxing;

class AutoBox {
	public static void main(String args[]) {

		Integer iOb = 100; // autobox an int

		int i = iOb; // auto-unbox

		System.out.println(i + " " + iOb); // displays 100 100
	}
}
