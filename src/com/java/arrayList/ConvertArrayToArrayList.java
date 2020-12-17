package com.java.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {

		// String[] str = { "array", "gopal", "goapl", "high" };
		List<Integer> s = new ArrayList<>();
		s.add(123);
		s.add(127);
		s.add(129);
		s.add(125);
		s.add(123);

		// List<String> list = new ArrayList<>(Arrays.asList(str));

		Integer[] arr = new Integer[s.size()];
		arr = s.toArray(arr);

		for (Integer f : arr) {
			System.out.println(f);
		}

	}

}
