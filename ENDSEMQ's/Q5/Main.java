import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {3, 7, 11, 5, 4, 6, 9, 12, 1, 2, 8, 10, 13, 14};

        System.out.println("Original Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        Arrays.sort(arr);

        System.out.println("\n\nSorted Array using Timsort:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}