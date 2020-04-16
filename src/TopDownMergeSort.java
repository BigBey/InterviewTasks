public class TopDownMergeSort {

    public static void sort(int[] array, int i, int j) {
        if (i != j) {
            int m = (i + j) / 2;
            sort(array, i, m);
            sort(array, m + 1, j);
            merge(array, i, m, j);
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {

    }

    private static void swap(int a, int b){
        int temp = a;
        a = b;
        b = a;
    }
}
