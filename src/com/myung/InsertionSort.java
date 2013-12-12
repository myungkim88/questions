package com.myung;

/*
 * Insertion Sort is a upgrade version. worst =  O(n2), best is nearly =  O(n)
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] a = {2, 1, 5, 4, 8, 6, 9};
		int[] b = insertionSort(a);

		for (int i = 0; i < b.length; i++) {
			if (i == b.length - 1) {
				System.out.print(b[i]);
			} else {
				System.out.print(b[i] + ",");
			}
		}

	}

	public static int[] insertionSort(int[] unsortedArr) {
		int c, tmp;
		for (int i = 1; i < unsortedArr.length; i++) {
			c = i - 1;
			while (c >= 0) {
				if (unsortedArr[i] < unsortedArr[c]) {
					tmp = unsortedArr[i];
					unsortedArr[i] = unsortedArr[c];
					unsortedArr[c] = tmp;
				}
				c--;
			}
		}

		return unsortedArr;
	}
}
