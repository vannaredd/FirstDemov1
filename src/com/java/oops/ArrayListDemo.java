package com.java.oops;

public class ArrayListDemo {

	public static void main(String[] args) {

		int noRows = 9;

		int rowCount = 1;

		for (int i = noRows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
			rowCount++;
		}

	}

}
