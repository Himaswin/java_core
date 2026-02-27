package Feb05_Jenkins_revisit;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());

        String s = "bro";
        System.out.println(s instanceof String);

    }
}
