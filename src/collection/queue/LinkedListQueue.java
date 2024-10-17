package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(13);

        // Add element
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        // First element remove
        System.out.println(queue.poll());

        // which number is next can be removed from starting
        System.out.println(queue.peek());
    }
}
