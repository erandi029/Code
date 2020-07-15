package Collections;

import java.lang.reflect.Array;

public class Stack_Array {
    int capacity;
    int[] stack = new int[2];
    int index = 0;

    public Stack_Array(int capacity){
        this.capacity = capacity;
    }
    public Stack_Array(){
        this.capacity = 2;
    }
    public void push(int val){

        if (index == capacity) {
            this.capacity = capacity+10;
            int[] tempStack = new int[capacity];
            System.arraycopy(this.stack, 0, tempStack,0,capacity-10);
            this.stack = tempStack;
        }
        stack[index] = val;
        index++;
    }

    public int pop(){
        if (stack.length == 0){
            return -1;
        }
        index--;
        return stack[index];
    }

    public int peek(){
        return stack[index-1];
    }
}
