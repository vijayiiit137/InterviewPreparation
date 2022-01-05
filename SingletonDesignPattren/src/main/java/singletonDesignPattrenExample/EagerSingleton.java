package singletonDesignPattrenExample;

public class EagerSingleton {

	static EagerSingleton eagerSingleton = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getEagerSingleton() {
		return eagerSingleton;
	}

}
