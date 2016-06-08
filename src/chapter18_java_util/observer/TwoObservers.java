package chapter18_java_util.observer;

class TwoObservers {
	public static void main(String args[]) {
		BeingWatched observed = new BeingWatched();
		Watcher1 observing1 = new Watcher1();
		Watcher2 observing2 = new Watcher2();

		// add both observers
		observed.addObserver(observing1);
		observed.addObserver(observing2);

		observed.counter(10);
	}
}