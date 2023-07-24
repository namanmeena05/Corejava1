package com.rays.streamapi;

import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("naman", "ashu", "annu", "sachin", "annu" );

		java.util.stream.Stream<String> stream = list.stream();

		stream.limit(4).forEach(f -> {
			System.out.println(f);
		});
		
		stream.filter(f -> f.startsWith("a")).distinct().forEach(f -> {
			System.out.println(" : "+ f);
		});
		

	}

}
