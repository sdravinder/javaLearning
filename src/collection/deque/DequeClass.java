package collection.deque;

import java.util.ArrayDeque;

public class DequeClass {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);      // Will add from the back.
        dq.offerLast(20);  // Will add from the back.
        dq.offerFirst(30); // Will add from the front.

        System.out.println(dq);

        System.out.println(dq.poll());      // will remove an element of front.
        System.out.println(dq.pollFirst()); // will remove an element of front.
        System.out.println(dq.pollLast());  // will remove an element of Back.

        System.out.println(dq.peekLast());  // will show the last element from the back.
        System.out.println(dq.peek());      // will show the first element from the front.
        System.out.println(dq.peekFirst()); // will show the first element from the front.
    }
}
