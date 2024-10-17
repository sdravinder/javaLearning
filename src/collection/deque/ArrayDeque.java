package collection.deque;

public class ArrayDeque {
    public static void main(String[] args) {

        java.util.ArrayDeque<Integer> adq = new java.util.ArrayDeque<Integer>();
        adq.offer(23);
        adq.offerFirst(12); // will add on first position
        adq.offerLast(45);  // will add on last position
        adq.offer(26); // will add at end

        System.out.println(adq);

        // for which position we went see element
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        // for which position we went see remove the element
        System.out.println(adq.poll());
        System.out.println("poll()" + adq);

        System.out.println(adq.peekFirst());
        System.out.println("pollFirst" + adq);

        System.out.println(adq.peekLast());
        System.out.println("pollLast" + adq);
    }
}
