public class QuickSort {

    private static int partition(int[] array, int low, int high, int pivot) {
        int k = low - 1;
        for (int i = low; i <= high; i++) {
            if (array[i] < array[pivot]) {
                k++;
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[k + 1];
        array[k + 1] = temp;
        return k + 1;
    }

    public static void sort(int[] array, int low, int high) {
        int pivot = high;
        if (high >= low) {
            pivot = partition(array, low, high, pivot);
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, high);
        }
    }
}
