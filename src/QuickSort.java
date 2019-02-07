public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 7, 33, 9, 2, 10, 3, 15, 8, 5, 32, 12, 777};
        arr=quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    private static int[] quicksort(int[] arr, int start, int end) {
        if (start>=end) return arr;
        int i = start;
        int j = end;
        int op = i - (i - j) / 2;
        while (i < j) {
            while ((i < op) && arr[i] <= arr[op]) i++;
            while ((j > op) && arr[j] >= arr[op]) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == op) op = j;
                else if (j == op) op = i;

            }
        }
quicksort(arr,start,op);
        quicksort(arr,op+1,end);
        return arr;
    }
}