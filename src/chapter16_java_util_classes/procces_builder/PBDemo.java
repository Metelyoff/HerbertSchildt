package chapter16_java_util_classes.procces_builder;

class PBDemo {
	public static void main(String args[]) {

		try {
			ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testfile");
			proc.start();
		} catch (Exception e) {
			System.out.println("Error executing notepad.");
		}
	}
}