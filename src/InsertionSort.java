import java.util.ArrayList;

public class InsertionSort {

    public static void sort(int[] array){
        int key,j;
        for(int i = 0; i < array.length; i++){
            key = array[i];
            j = i;
            while(j > 0 && array[j-1] > key){
                array[j] = array[j-1];
                j--;
            }
            array[j] = key;
        }
    }
}
