package com.denis;

public class B extends A{
	private String str;
	
	public B () {
		str = "b";
	}
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getStr());
	}
}
