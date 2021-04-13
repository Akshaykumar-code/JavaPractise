package com.singleton;

public class Child extends Parent{
	
	@Override
	public void m1() {
		System.out.println("parent m1");
	}

	@Override
	public int m2() {
		System.out.println("parent m2");
		return 0;
	}

	@Override
	public double m3() {
		System.out.println("parent m3");
		return 0.0;
	}

}
