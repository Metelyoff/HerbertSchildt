package chapter18_java_util.observer;

import java.util.*;

//This is the first observing class.
class Watcher1 implements Observer {
	public void update(Observable obj, Object arg) {
		System.out.println("update() called, count is " + ((Integer) arg).intValue());
	}
}