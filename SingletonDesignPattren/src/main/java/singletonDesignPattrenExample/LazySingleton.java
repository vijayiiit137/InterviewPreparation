package singletonDesignPattrenExample;

import java.io.Serializable;

public class LazySingleton implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static LazySingleton lazySingleton;

	private LazySingleton() {

	}

	public static LazySingleton getLazySingletonInstance() {

		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
			return super.clone();
	}

}
