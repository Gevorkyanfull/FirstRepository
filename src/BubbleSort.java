import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 2, 7, 1, 5, 4};
        sort(array);
    }
    private static void sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

