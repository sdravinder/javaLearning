package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(10);  // we can use add but in queue it is recommended to use offer.
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q);

        System.out.println(q.poll()); // It will remove the first element from queue that is 10.

        System.out.println(q);

        System.out.println(q.peek()); // To check which element is next to come out of the queue.

        System.out.println(q);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }


    }
}
