import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] array = {8,9,3,7,6,7,1};
        QuickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }
    public static void QuickSort(int[] array, int left, int right){
        int center = (left + right) / 2;
        System.out.println(array[center]);
    }
    public static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];

    }
}
