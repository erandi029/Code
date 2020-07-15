package Algorithm;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high){
        if(low < high+1){
            int partition = partition(array, low, high);
            quickSort(array, low, partition -1);
            quickSort(array, partition+1, high);
        }
    }

    private static int partition(int[] array, int low, int high){
        int pivot = array[low];
        int border = low+1;

        for (int i = border; i <= high ; i++){
            if(array[i] < pivot){
                swap(array, i, border++);
            }
        }
        swap(array, low, border-1);

        return border -1;
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
