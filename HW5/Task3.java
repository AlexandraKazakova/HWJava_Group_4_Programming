package HW5;

// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class Task3 {
	public static void sort(int arr[]) {
		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			pyramid(arr, n, i);
		}
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
			pyramid(arr, i, 0);
		}
	}
	static void pyramid(int arr[], int n, int i){
		int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
			arr[largest] = swap;
   
            pyramid(arr, n, largest);
		}
	}
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
    {
        int arr[] = {16, 22, 3, 45, 8, 10, 52, 4};

        Task3 ob = new Task3();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
