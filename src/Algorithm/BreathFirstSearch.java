package Algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {

    public static void bfs(Node root){
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> visited = new HashSet<>();

        queue.add(root);
        visited.add(root);

        while(!queue.isEmpty()){

            Node currentNode = queue.remove();

            //Logic
            System.out.println(currentNode.value);

            for(Node child: currentNode.adjacent){
                if(!visited.contains(child)){
                    queue.add(child);
                    visited.add(child);
                }
            }
        }


    }
}
