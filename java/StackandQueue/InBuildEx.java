package StackandQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuildEx {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(33);
        // stack.push(22);
        // stack.push(11);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(34);
        queue.add(23);
        queue.add(12);
        
        System.out.println(queue.peek()); // it will return first item but not remove
        System.out.println(queue.remove());     // it will remove the first item

        Deque<Integer> deque = new ArrayDeque<>();   // in deque we can add item or remove from both last as well as start and it is more fast then ll and stack
        deque.add(33);
        deque.addLast(3);
        deque.remove();
     }
}
