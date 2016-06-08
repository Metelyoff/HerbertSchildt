package chapter7_classes_and_methods;

class CommandLineArgumets {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("str [" + i + "] = " + args[i]);
		}
	}
}
