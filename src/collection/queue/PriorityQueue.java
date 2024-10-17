package collection.queue;

import java.util.Comparator;
import java.util.Queue;

public class PriorityQueue {

    public static void main(String[] args) {

        Queue<Integer> pq = new java.util.PriorityQueue<Integer>();

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        // As it implements min heap small element will come the first position that is 12.
        System.out.println(pq);
        // View-first element will remove and will make next small number at first position.
        pq.poll();
        System.out.println(pq);

        //will print the first number which can be removed that is 24.
        System.out.println(pq.peek());

        // If we want to remove  greater number from queue then Comparator reverseOrder.
        Queue<Integer> pq2 = new java.util.PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(12);
        pq2.offer(24);
        pq2.offer(36);
        pq2.offer(40);
        System.out.println(pq2);

        // Will remove the first element that is greater no. 40.
        pq2.poll();
        System.out.println(pq2);
    }
}
