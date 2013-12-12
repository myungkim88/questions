package com.google;

public class Itoa {

	public static String itoa(int number) {
		String result = "";
		int value = number;
		while (value != 0) {
			int remainder = value % 10;
			value = value / 10;
			char c = (char) (remainder + 48);

			result = c + result;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(itoa(123));
	}
}
