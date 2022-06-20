package part1;
/*
Быстроя сортировка
 */
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
    //    int[] array = {8,5,4,6,2,1,6,5,2,10,55,13,15,16};
        int[] array = {8,9,3,7,6,7,1};
        quickSort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right){
    int index = 0;
    if (array.length > 1){
        index = partition(array,left, right);
        if (left < index - 1){
            quickSort(array,left, index -1);
        }
        if(index < right){
            quickSort(array,index,right);
        }
    }
    }
    public static int partition(int[] array, int left, int right){
        int centre = array[(right + left) / 2 ];
        while (left <= right){
            while (array[left] < centre){
                left++;
            }
            while (array[right] > centre){
                right--;

            }
            if (left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
    private static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
