package Collections;

public class Stack_Nodes {
    Node head;

    public void push(int val){
        if(head == null){
            head = new Node(val);
        }

        Node current = new Node(val);
        current.next = head;
        head = current;
    }

    public Integer pop(){
        if(head == null){
            return null;
        }
        Node current = head;
        head = head.next;
        return current.val;
    }

    public Integer peek(){
        if(head == null){
            return null;
        }

        return head.val;
    }

    public boolean isEmpty(){
        return head ==null;
    }
}

class Node {
    int val;
    Node next;

    public Node(int value){
        this.val = value;
    }
}
