package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class AverageScore {

    public static int[][] highFive(int[][] items){

        HashMap<Integer, PriorityQueue<Integer>> records = new HashMap<>();


        for(int[] item: items){
            int id = item[0];
            int score = item[1];

            if(records.containsKey(id)){
                PriorityQueue heap = records.get(id);

                heap.offer(score);
                if(heap.size() >5){
                    heap.poll();
                }
            } else{
                PriorityQueue<Integer> heap = new PriorityQueue<>();
                heap.offer(id);
                records.put(id, heap);
            }
        }

        int[][] results = new int[records.size()][2];

        for(Map.Entry<Integer, PriorityQueue<Integer>> entry : records.entrySet()){
            int id = entry.getKey();
            PriorityQueue<Integer> heap = entry.getValue();
            int sum = 0;
            int size = heap.size();

            while(!heap.isEmpty()){
                sum+= heap.poll();
            }

            results[id-1][0] = id;
            results[id-1][1] = sum/size;

        }

        return results;


    }
}
