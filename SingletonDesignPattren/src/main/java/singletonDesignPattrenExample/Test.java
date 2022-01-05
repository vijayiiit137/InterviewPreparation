package singletonDesignPattrenExample;

public class Test {

	public static void main(String[] args) {

		EagerSingleton eagerSingleton = EagerSingleton.eagerSingleton;
		EagerSingleton eagerSingletonOne = eagerSingleton;
		System.out.println(eagerSingleton.hashCode());
		System.out.println(eagerSingletonOne.hashCode());

	}

}
