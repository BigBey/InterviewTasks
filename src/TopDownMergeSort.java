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
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= end){
            if(array[i] < array[j]){
                temp[k] = array[i];
                k++; i++;
            }else{
                temp[k] = array[j];
                k++;j++;
            }
        }

        while(i <= mid){
            temp[k] = array[i];
            k++; i++;
        }

        while(j <= end){
            temp[k] = array[j];
            k++; j++;
        }

        for(int l = start; l <= end; l++){
            array[l] = temp[l - start];
        }
    }
}
