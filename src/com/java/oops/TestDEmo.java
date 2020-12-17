package com.java.oops;

import java.util.Optional;

public class TestDEmo {

	public static void main(String[] args) {

		String x = "rama";

		Optional<String> str1 = Optional.ofNullable(x);
		if (str1.isPresent()) {
		}
		System.out.println(str1.orElseGet(() -> "java9O"));
		System.out.println(str1.orElseThrow(IllegalArgumentException::new));

	}

}

interface MyInterface {
	public String getBook();
}
