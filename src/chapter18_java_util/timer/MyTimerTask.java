package chapter18_java_util.timer;

import java.util.*;

class MyTimerTask extends TimerTask {
	public void run() {
		System.out.println("Timer task executed.");
	}
}