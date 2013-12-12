package com.google;

public class NegativeBase {
	private static String result = "";

	public static String getNegativeBase(int number, int base) {
		int remainder = number % base;
		int value = number / base;
		if (remainder < 0) {
			value += 1;
			remainder += -base;
		}
		if (value > 0 && value < base) {
			return ""+value;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getNegativeBase(100, -2));
	}
}
