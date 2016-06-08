package chapter18_java_util.observer;

import java.util.Observable;
import java.util.Observer;

class Watcher2 implements Observer {
	public void update(Observable obj, Object arg) {
		// Ring bell when done
		if (((Integer) arg).intValue() == 0)
			System.out.println("Done" + '\7');
	}
}