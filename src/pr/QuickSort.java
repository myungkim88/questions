package pr;

public class QuickSort {
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
	
	public static void main (String args[]) {
		
	}
}
