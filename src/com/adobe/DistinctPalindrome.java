package com.adobe;

import java.util.HashSet;

public class DistinctPalindrome {
	public static void main(String[] args) {
		String palindrome = "abceecba";

		HashSet<String> list = getDistinctPalindromeList(palindrome);

		if (list.size() > 0) {
			for (String str : list) {
				System.out.println(str);
			}
		}
	}

	private static HashSet<String> getDistinctPalindromeList(String palindrome) {
		if (!isPalindrome(palindrome)) {
			return new HashSet<String>();
		}

		HashSet<String> list = new HashSet<String>();
		String tmp = "";

		if (palindrome.length() % 2 == 1) {
			int count = palindrome.length() / 2;
			while (count >= 0) {
				if (count != palindrome.length() / 2) {
					tmp = palindrome.charAt(count) + tmp + palindrome.charAt(count);
				} else {
					tmp = palindrome.charAt(count) + "";
				}
				if (!list.contains(palindrome.charAt(count))) {
					list.add(palindrome.charAt(count) + "");
				}
				if (tmp != "" && !list.contains(tmp)) {
					list.add(tmp);
				}
				count--;
			}
		} else {
			int count = palindrome.length() / 2 - 1;
			while (count >= 0) {
				tmp = palindrome.charAt(count) + tmp + palindrome.charAt(count);

				if (!list.contains(palindrome.charAt(count))) {
					list.add(palindrome.charAt(count) + "");
				}
				if (tmp != "" && !list.contains(tmp)) {
					list.add(tmp);
				}
				count--;
			}
		}

		return list;
	}

	private static boolean isPalindrome(String palindrome) {
		int pivot = palindrome.length() / 2;
		String firsthalf, secondhalf = "";
		if (palindrome.length() % 2 == 0) {
			firsthalf = palindrome.substring(0, pivot);

			for (int i = palindrome.length() - 1; i >= pivot; i--) {
				secondhalf = secondhalf + palindrome.charAt(i);
			}

		} else {
			firsthalf = palindrome.substring(0, pivot - 1);
			for (int i = palindrome.length() - 1; i > pivot + 1; i--) {
				secondhalf = secondhalf + palindrome.charAt(i);
			}
		}
		return firsthalf.equals(secondhalf);
	}
}
