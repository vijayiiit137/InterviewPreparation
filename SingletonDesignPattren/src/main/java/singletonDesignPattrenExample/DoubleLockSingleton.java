package singletonDesignPattrenExample;

public class DoubleLockSingleton {

	static DoubleLockSingleton doubleLockSingleton = new DoubleLockSingleton();

	public static DoubleLockSingleton getDoubleLockSingleton() {

		if (doubleLockSingleton == null) {

			synchronized (DoubleLockSingleton.class) {

				if (doubleLockSingleton == null) {

					doubleLockSingleton = new DoubleLockSingleton();

				}

			}
		}
		return doubleLockSingleton;

	}

}
