package com.myung;

/*
 * Brutal force sorting == BubbleSort
 */

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {4, 2, 7, 5, 1, 3};

		int[] b = bubbleSort(a);

		for (int i = 0; i < b.length; i++) {
			if(i==b.length-1)
			{
				System.out.println(b[i]);
			}
			else
			{
				System.out.print(b[i]+",");				
			}
		}
	}

	public static int[] bubbleSort(int[] unsortedArr) {
		int tmp;
		for (int c = 1; c < unsortedArr.length; c++) {
			for (int i = 1; i < unsortedArr.length; i++) {
				if (unsortedArr[i - 1] > unsortedArr[i]) {
					tmp = unsortedArr[i - 1];
					unsortedArr[i - 1] = unsortedArr[i];
					unsortedArr[i] = tmp;
				}
			}

		}
		return unsortedArr;
	}
}
