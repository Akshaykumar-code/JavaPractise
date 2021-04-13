package com.singleton;

public class StaticInnerClassApproach {
	
	private static class StaticInnerClass{
		private static final StaticInnerClassApproach instance = new StaticInnerClassApproach();
	}
	
	public static StaticInnerClassApproach getInstance() {
		return StaticInnerClass.instance;
	}

}
