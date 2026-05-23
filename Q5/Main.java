import java.util.*;

public class Main {

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    static int quickSelect(int[] arr, int low, int high, int k) {

        if (low <= high) {

            int pivotIndex = partition(arr, low, high);

            if (pivotIndex == k)
                return arr[pivotIndex];

            else if (pivotIndex > k)
                return quickSelect(arr, low, pivotIndex - 1, k);

            else
                return quickSelect(arr, pivotIndex + 1, high, k);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {37, 12, 28, 45, 19, 33, 22, 50, 15};

        int n = arr.length;

        int k = n / 2;

        int median = quickSelect(arr, 0, n - 1, k);

        System.out.println("Median ETA: " + median);

        System.out.println("\nArray after Quickselect:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}