package com.expedia;

public class SinglePassOperation {

	public static void main(String arg[]) {
		String str = "1+2*1+2";
		String strNum = null;
		int a = 0;
		int b = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))){
				strNum += str.charAt(i);
				
			}
			else{
				if(str.charAt(i) == '*') {
					
				}
			}
			if(str.charAt(i) == '*') {
				
			}
		}
	}
}
