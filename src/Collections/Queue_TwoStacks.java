package Collections;

import java.util.Stack;

public class Queue_TwoStacks {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public Queue_TwoStacks(){
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void enqueu(int x){
        s1.push(x);
    }

    public Integer dequeu(){
        if(s1.isEmpty() && s2.isEmpty()){
            return null;
        }

        if (s2.isEmpty()) {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
 }
