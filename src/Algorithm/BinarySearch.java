package Algorithm;

public class BinarySearch {

    public static boolean binarySearchRecursive(int[] array, int item, int left, int right){
        if(left > right || left <0 || right >= array.length){
            return false;
        }

        int mid = (left +right)/2; // overflow left+((right-left)/2)

        if (array[mid] == item){
            return true;

        } else if (array[mid] < item){
            return binarySearchRecursive(array, item, mid+1, right);

        } else {
            return binarySearchRecursive(array, item, left, mid-1);

        }
    }

    public static boolean binarySearchIterative(int[] array, int item){
        int left = 0;
        int right = array.length -1;
        int mid;

        while(left <= right) {

            mid = (left +right)/2; // overflow left+((right-left)/2)

            if (array[mid] == item) {
                return true;

            } else if (array[mid] < item) {
                left = mid +1;

            } else {
                right = mid - 1;

            }

        }

        return false;
    }
}
