package singletonDesignPattrenExample;

public class SynchronizedSingleton {

	static SynchronizedSingleton synchronizedSingleton;

	private SynchronizedSingleton() {

	}

	public static synchronized SynchronizedSingleton getThreadClassSingleton() {

		if (synchronizedSingleton == null) {
			synchronizedSingleton = new SynchronizedSingleton();
		}
		return synchronizedSingleton;

	}
}
