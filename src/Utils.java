public class Utils {
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
