package com.singleton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) throws IOException {
		/*
		 * List<Integer> list = new ArrayList<>();
		 * 
		 * list.add(2); list.add(4); list.add(5); list.add(6);
		 * 
		 * list.stream().map(x->Math.sqrt(x)).reduce(null);
		 */

		IntStream.range(1, 10).forEach(System.out::println);
		System.out.println();
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));
		System.out.println();
		System.out.println(IntStream.range(1, 5).sum());

		Stream.of("Shweta", "Akshay", "Rashmi").sorted().findFirst().ifPresent(System.out::printf);

		System.out.println();
		System.out.println("==============================================");

		// stream from array , sort filter and print
		String[] string = { "Akshay", "Jayesh", "Jayant", "Jayendra", "Magesh" };

		Stream.of(string).filter(s -> s.startsWith("J")).sorted().forEach(System.out::println);

		// average of squares of an int array

		System.out.println(IntStream.of(2, 4, 6, 8, 10).map(x -> x * x).average());

		// stream from list, filter and print
		Stream.of(string).map(String::toLowerCase).filter(s -> s.startsWith("j")).forEach(System.out::println);
		
		
		// Stream rows from text files , sort , filter and print 
		
		/*
		 * Stream<String> bands = Files.lines(Paths.get("band.txt"));
		 * bands.sorted().filter(x->x.length()>13).forEach(System.out::println);
		 * 
		 * bands.close();
		 */
		
		
		
	}

}
