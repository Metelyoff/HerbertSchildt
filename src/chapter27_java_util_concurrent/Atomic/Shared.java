package chapter27_java_util_concurrent.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

class Shared {
	static AtomicInteger ai = new AtomicInteger(0);
}