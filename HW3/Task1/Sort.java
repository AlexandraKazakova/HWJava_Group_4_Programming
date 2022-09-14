package HW3.Task1;

public class Sort {
	public static void main(String[] args) {
		int [] arr = {8, 7, 45, 12 , 1, 25 , 18, 3, 228, 1000, -3};
		mergeSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void mergeSort(int[] arr) {
		int n = arr.length;
		if( n == 1) return;

		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for(int i = 0; i < mid; i++){
			l[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = arr[i];
		}
		mergeSort(l);
		mergeSort(r);
		merge(arr, l, r);
	}

	private static void merge(int[] arr, int[] l, int[] r) {
		int left = l.length;
		int right = r.length;
		int i =  0;
		int j = 0;
		int idx = 0;

		while (i < left && j < right) {
			if (l[i] < r[j]) {
				arr[idx] = l[i];
				i++;
			}
			else{
				arr[idx] = r[j];
				j++;
			}
			idx++;
		}
		for (int k = i; k < left; k++) {
			arr[idx++] = l[k];
		}
		for (int m = j; m < right; m++) {
			arr[idx++] = r[m];
		}
	}
}
