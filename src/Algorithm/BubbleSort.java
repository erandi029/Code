package Algorithm;

public class BubbleSort {

    public static void bubblesort(int[] array){
        boolean isSorted = false;

        while(!isSorted) {

            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if(array[i]> array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                    isSorted = false;
                }
            }
        }
    }
}
