import java.util.*;
public class AllSortTechniques {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSor(arr);
        List<Integer> abc = Arrays.stream(arr).boxed().toList();
        System.out.println(abc);


    }

    static void swap(int arr[], int a, int b) {
        int x = arr[a];
        arr[a] = arr[b];
        arr[b] = x;
    }

    static void bubbleSor(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}
