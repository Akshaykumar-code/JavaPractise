package com.singleton;

import java.util.ArrayList;
import java.util.List;

public class ForEachAndFilter {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("john");
		list.add("peter");
		list.add("pincent");
		list.add("satish");
		list.add("manish");
		
		
		list.stream().filter(s->s.startsWith("p")).forEach(System.out::println);
	}
 }
 