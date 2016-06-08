package chapter18_java_util.observer;

import java.util.Observable;

class BeingWatched2 extends Observable {
	void counter(int period) {
		for (; period >= 0; period--) {
			setChanged();
			notifyObservers(new Integer(period));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Sleep interrupted");
			}
		}
	}
}