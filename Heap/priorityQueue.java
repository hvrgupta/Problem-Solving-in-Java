import java.util.Collections;
import java.util.PriorityQueue;

class priorityQueueImpl {
    public static void main(String[] args) {
        // Default Implementation Min-Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());
        System.out.println("-----------");

        // For max heap pass Collection.reverseOrder()
        PriorityQueue<Integer> pqm = new PriorityQueue<>(Collections.reverseOrder());
        pqm.add(10);
        pqm.add(20);
        pqm.add(30);
        System.out.println(pqm.peek());
        pqm.poll();
        System.out.println(pqm.peek());

    }
}
