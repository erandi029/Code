import Algorithm.MergeSort;
import Collections.Queue_TwoStacks;
import Collections.Stack_Array;
import Collections.Stack_Nodes;

import java.util.Arrays;


public class Application {
    public static void main(String[] args) {

        Queue_TwoStacks queue = new Queue_TwoStacks();

        queue.enqueu(10);
        queue.enqueu(20);
        queue.enqueu(30);
        queue.enqueu(40);
        queue.enqueu(50);

        System.out.println(queue.dequeu());

    }
}
