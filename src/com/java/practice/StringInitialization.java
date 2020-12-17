package com.java.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringInitialization {

	public static void main(String[] args) {
		

		Map<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(11, "a");
        //Collections.unmodifiableMap(hashMap);
        hashMap.put(11, "b");
        System.out.println(hashMap);

	}
}
