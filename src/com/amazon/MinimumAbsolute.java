package com.amazon;

import java.util.HashSet;

public class MinimumAbsolute {

	public static void main (String args[]) {
		int[] a = {1, 2, 5, 7, 9};
		int[] b = {-5, 4, 12};
		
		// need a & b merge
		int[] shorterArr;
		HashSet<Integer> longerArrHash = new HashSet<Integer>();
		int[] sortedM = {-5, 1, 2, 4, 5, 9, 12};

		if (a.length > b.length) {
			shorterArr = b;
			for (int i = 0; i < a.length; i++) {
				longerArrHash.add(a[i]);
			}
		} else {
			shorterArr = a;
			for (int i = 0; i < b.length; i++) {
				longerArrHash.add(b[i]);
			}
		}
		int tempA = 0;
		int tempB = 0;
		int min = 99999;

		for (int j = 0; j < shorterArr.length; j++) {
			for (int i = 0; i < sortedM.length; i++) {
				if (shorterArr[j] == sortedM[i]) {

					int countLeft = i - 1;
					while (countLeft > 0) {
						if (longerArrHash.contains(sortedM[countLeft])) {
							int tmpMin = Math.abs(sortedM[countLeft]-shorterArr[j]);
							if (min>tmpMin) {
								tempA=sortedM[countLeft];
								tempB=shorterArr[j];
								min = tmpMin;
								break;
							}
						}
						countLeft--;
					}
					int countRight = i + 1;
					while (countRight < sortedM.length) {
						if (longerArrHash.contains(sortedM[countRight])) {
							int tmpMin = Math.abs(sortedM[countRight]-shorterArr[j]);
							if (min> tmpMin) {
								tempA=sortedM[countRight];
								tempB=shorterArr[j];
								min = tmpMin;
								break;
							}
						}
						countRight++;
					}

				}
			}
		}
		
		System.out.println("tempA: " + tempA);
		System.out.println("tempB: " + tempB);
		System.out.println("min: " + min);

	}

	public void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1) {
			quickSort(arr, left, index - 1);
		}
		if (index < right) {
			quickSort(arr, index, right);
		}
	}

	public int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right) / 2];
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("in progress of partition");
		}
		return left;

	}

	static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
