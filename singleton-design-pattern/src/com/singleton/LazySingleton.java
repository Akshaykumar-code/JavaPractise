package com.singleton;

import java.io.Serializable;

public class LazySingleton implements Cloneable, Serializable{
	
	private static LazySingleton instance;
	
	private LazySingleton() {
	}
	
	protected Object readresolve() {
		return instance;
	}
	
	// to avoid the RACE condition
	public static synchronized LazySingleton getInstance() {
		synchronized(LazySingleton.class) {
			if(instance==null) {
				instance = new LazySingleton();
			}	
		}
		return instance;
	}
	
}
