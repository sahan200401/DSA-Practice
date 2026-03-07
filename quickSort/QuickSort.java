public class QuickSort {
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);  // Partition the array
            quickSort(arr, low, pi - 1);        // Recursively sort left subarray
            quickSort(arr, pi + 1, high);       // Recursively sort right subarray
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];   // Choose last element as pivot
        int i = low - 1;         // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot to correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return pivot index
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 10, 2, 6, 1, 7, 9};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}