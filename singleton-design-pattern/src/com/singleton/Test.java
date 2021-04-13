package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		/*
		 * System.out.println(EagerSingleton.getInstance().hashCode());
		 * System.out.println(EagerSingleton.getInstance().hashCode());
		 * 
		 * System.out.println(LazySingleton.getInstance().hashCode());
		 * System.out.println(LazySingleton.getInstance().hashCode());
		 * 
		 * System.out.println(StaticInnerClassApproach.getInstance().hashCode());
		 * System.out.println(StaticInnerClassApproach.getInstance().hashCode());
		 * System.out.println("------------------------------------------------");
		 * System.out.println(LazySingleton.getInstance().hashCode());
		 * System.out.println(LazySingleton.getInstance().clone().hashCode());
		 */
		
		/*
		 * System.out.println(LazySingleton.getInstance().hashCode());
		 * 
		 * Constructor<?>[] constructors =
		 * LazySingleton.class.getDeclaredConstructors();
		 * 
		 * 
		 * LazySingleton reflectionApi ;
		 * 
		 * for (Constructor cons : constructors) { cons.setAccessible(true);
		 * reflectionApi = (LazySingleton) cons.newInstance();
		 * System.err.println(reflectionApi.hashCode()); }
		 */
		
		// serializable 
		
		LazySingleton instance = LazySingleton.getInstance();
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("seriliazable.ser"));
		os.writeObject(instance);
		os.close();
		
		ObjectInput oi = new ObjectInputStream(new FileInputStream("seriliazable.ser"));
		LazySingleton instance2 = (LazySingleton) oi.readObject();
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
	}

}
