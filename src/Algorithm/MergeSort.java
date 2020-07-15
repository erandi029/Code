package Algorithm;

public class MergeSort {

    public static void mergesort(int[] array) {
        mergesort(array, new int[array.length], 0, array.length-1);
    }

    public static void mergesort(int[] array, int[] temp, int leftStartIn, int rightEndIndex) {
        if (leftStartIn >= rightEndIndex){
            return;
        }

        int middle = (leftStartIn + rightEndIndex)/2 ;
        mergesort(array, temp, leftStartIn, middle);
        mergesort(array, temp, middle+1, rightEndIndex);
        merge(array, temp, leftStartIn, rightEndIndex);

    }

    public static void merge(int[] array, int[] temp, int leftStartIn, int rightEndIn){
        int leftEndIn = (leftStartIn+ rightEndIn)/2;
        int rightStart = leftEndIn+1;
        int size = rightEndIn-leftStartIn+1;

        int left = leftStartIn;
        int right = rightStart;
        int index = leftStartIn;

        while (left<= leftEndIn && right <= rightEndIn){
            if(array[left]<= array[right]){
                temp[index++] = array[left++];
            } else {
                temp[index++] = array[right++];
            }
        }

        System.arraycopy(array,left,temp,index, leftEndIn-left+1);
        System.arraycopy(array,right,temp,index, rightEndIn-right+1);
        System.arraycopy(temp,leftStartIn, array, leftStartIn, size);
    }
}
