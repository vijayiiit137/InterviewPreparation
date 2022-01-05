package singletonDesignPattrenExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToBreakSingleTon {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			FileNotFoundException, IOException, CloneNotSupportedException {

		LazySingleton originalSingleTon = LazySingleton.getLazySingletonInstance();

		/* Using Reflection */
		Class<?> lazySingleton = Class.forName("singletonDesignPattrenExample.LazySingleton");
		Constructor<LazySingleton> lazySingleTon = (Constructor<LazySingleton>) lazySingleton.getDeclaredConstructor();
		lazySingleTon.setAccessible(true);
		LazySingleton brokenSingletonUsingReflections = lazySingleTon.newInstance();

		System.out.println("Hashcode for Original Singleton Instance is:" + originalSingleTon.hashCode());
		System.out.println("HashCode for broken singletonReflection is:" + brokenSingletonUsingReflections.hashCode());

		System.out.println("-------------------------------------");
		System.out.println("Breaking Using Serialization");

		// Serialization Process
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("C:\\Serialization\\Serialization.txt"));
		objectOutputStream.writeObject(originalSingleTon);
		objectOutputStream.close();

		// deSerialization Process

		ObjectInputStream inputStream = new ObjectInputStream(
				new FileInputStream("C:\\Serialization\\Serialization.txt"));
		LazySingleton brokenSingletonUsingSerializations = (LazySingleton) inputStream.readObject();

		System.out.println("HashCode for Original Singleton Instance is:" + originalSingleTon.hashCode());
		System.out
				.println("HashCode for broken Singleton Instance is:" + brokenSingletonUsingSerializations.hashCode());

		// Cloning
		System.out.println("---------------------------------------");
		System.out.println("Breaking Using Cloning");
		LazySingleton lazyCloneable = (LazySingleton) originalSingleTon.clone();

		System.out.println("HashCode for OriginalSingletonInstance is:" + originalSingleTon.hashCode());
		System.out.println("HashCode for cloneable instance is:" + lazyCloneable.hashCode());

	}

}
