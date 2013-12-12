package com.google;

public class FindCommon {
	public static String findCommon(String a, String b, int m) {
		
		String small, large;
		if (a.startsWith("-") || a.endsWith("-")) {
			small = a;
			large = b;
		} else {
			small = b;
			large = a;
		}
		boolean startCommon = false;
		StringBuilder common = new StringBuilder();
		StringBuilder tmpCommon = new StringBuilder();
		for (int i=0;i<m;i++) {
			if ((large.charAt(i) == small.charAt(i))) {
				startCommon = true;
				common.append(tmpCommon);
				tmpCommon = new StringBuilder();
				common.append(b.charAt(i));
			} else if (startCommon && small.charAt(i) == '-') {
				tmpCommon.append(large.charAt(i));
			}
		}
		
		return common.toString();
		
	}
	
	public static void main(String[] args) {
		String a = "------bixg--";
		String b = "xxxxxxbi-gzz";
		int m = 12;
		
		System.out.println(findCommon(a, b, m));
		
	}
}
