import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform merge sort
        mergeSort(arr, 0, n - 1);

        // Print sorted array using Collection Framework in one line
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        System.out.println(list);
    }

    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }
    }

    static void merge(int arr[], int low, int high, int mid) {
        int left[] = Arrays.copyOfRange(arr, low, mid + 1);
        int right[] = Arrays.copyOfRange(arr, mid + 1, high + 1);

        int i = 0, j = 0, k = low;

        // Merging the two subarrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left array if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right array if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
