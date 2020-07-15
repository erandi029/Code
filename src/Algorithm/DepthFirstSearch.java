package Algorithm;

import java.util.*;

/**
 *
 * Depth first search
 *      O(V+E)
 *
 *
 * APPLICATION
 *  1. On Directed Acyclic Graph (DAG) -> Topological sorting -> Task scheduling.
 *
 *
 */

public class DepthFirstSearch {

    public static void main(String[] args) {

        Node second = new Node(2);
        second.addNode(new Node(4));
        second.addNode(new Node(5));
        Node one = new Node(1);
        one.addNode(second);
        one.addNode(new Node(3));

        boolean result = dfs(one, 7);
        System.out.println(result);

    }

    public static boolean dfs(Node root, int value){
        Stack<Node> stack = new Stack<>();
        HashSet<Node> visited = new HashSet<>();

        stack.add(root);
        visited.add(root);

        while(!stack.isEmpty()){

            Node currentNode = stack.pop();

            //Logic
            if(currentNode.value == value){
                return true;
            }
            ///

            for(Node child: currentNode.adjacent){
                if(!visited.contains(child)){
                    stack.add(child);
                    visited.add(child);
                }
            }
        }

        return false;


    }


}

class Node{

    int value;
    public List<Node> adjacent;

    Node(int value){
        this.value = value;
        this.adjacent = new ArrayList<>();
    }

    public void addNode(Node node){
        this.adjacent.add(node);
    }
}
