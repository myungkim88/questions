package com.myung;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = {4, 3, 1, 2, 7};
		int b[] = selectionSort(a);

		for (int i = 0; i < b.length; i++) {
			if (i == b.length-1) {
				System.out.print(b[i]);
			} else {
				System.out.print(b[i] + ",");
			}
		}
	}

	public static int[] selectionSort(int[] unsortedArr) {
		int tmp;
		int sortedIndex = 0;

		while (sortedIndex < unsortedArr.length) {
			int minIndex = sortedIndex;
			int min = unsortedArr[sortedIndex];
			for (int i = sortedIndex; i < unsortedArr.length; i++) {
				if (unsortedArr[i] < min) {
					min = unsortedArr[i];
					minIndex = i;
				}
			}
			tmp = unsortedArr[minIndex];
			unsortedArr[minIndex] = unsortedArr[sortedIndex];
			unsortedArr[sortedIndex] = tmp;
			sortedIndex++;
		}

		return unsortedArr;
	}
}
