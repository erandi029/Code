package problems;

import java.util.PriorityQueue;

/***
 *
 * mainataining heap (Min or Max based on the requirement)
 *
 *
 */

public class KthElement {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> a-b);

        for(int i: nums){
            heap.add(i);
            if(heap.size() > k){
                heap.poll();
            }
        }

        return heap.poll();

    }

}

